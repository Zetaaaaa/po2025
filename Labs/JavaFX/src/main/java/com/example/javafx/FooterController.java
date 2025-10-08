package com.example.javafx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FooterController {

    @FXML
    private Button exitButton;

    @FXML
    private void initialize() {
        exitButton.setOnAction(event -> {
            Platform.exit();
        });
    }






}
