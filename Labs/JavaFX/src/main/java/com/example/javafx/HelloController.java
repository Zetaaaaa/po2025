package com.example.javafx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void turnOffApplication() {
        Platform.exit();
    }

    @FXML
    private TextField nameID;

    @FXML
    private TextField surnameID;

    @FXML
    private Label outName;

    @FXML
    private Label outSurname;

    @FXML
    private Button setData;


    @FXML
    protected void getInputData() {

        String inputName = nameID.getText().trim();
        String inputSurname = surnameID.getText().trim();

        Person person = new Person(inputName,inputSurname);
        System.out.print(person.getName());
        System.out.print(person.getSurname());

        outName.setText(person.getName());
        outSurname.setText(person.getSurname());


    }


}
