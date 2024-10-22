package org.example.hms;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.*;
import java.time.*;

public class HelloController {
    public Clock clock = null;
    private Stage stage;
    public void setStage(Stage stage){
        this.stage=stage;
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("Hi");

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hi2");

        stage.close();
    }
}