package com.example.e_commerce;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Ecommerce extends Application {

    UserInterface userinterface = new UserInterface();
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(userinterface.createContent());
        stage.setTitle("E - Commerce");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}