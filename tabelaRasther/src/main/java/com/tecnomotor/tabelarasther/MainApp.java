package com.tecnomotor.tabelarasther;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("telaPrincipal"));
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    //Método criado para carregar o arquivo ".fxml"
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent parent = fxmlLoader.load(MainApp.class.getResource(fxml +".fxml").openStream());
        return parent;
    }

    public static void main(String[] args) {
        launch();
    }
}