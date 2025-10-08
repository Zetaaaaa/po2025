package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource("Main.fxml"));
        Scene scene = new Scene(loader.load());

        URL cssResource = MainApplication.class.getResource("/styles/style.css");
        if (cssResource != null) {
            scene.getStylesheets().add(cssResource.toExternalForm());
        }
        primaryStage.setTitle("Object Programing - App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
