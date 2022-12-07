package com.tecnomotor.tabelarasther.controller;

import com.tecnomotor.tabelarasther.MainApp;
import com.tecnomotor.tabelarasther.model.Categoria;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CategoriaController implements Initializable {

    @FXML
    private ChoiceBox<Categoria> cbCategorias;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //O combo box está sendo povoado pelo enum criado no pacote model
        cbCategorias.getItems().setAll(Categoria.values());

        //Com os dados da categoria "LEVES" fazemos uma filtragem com um if.
        cbCategorias.setOnAction(actionEvent -> {
            if (cbCategorias.getSelectionModel().getSelectedItem() == Categoria.LEVES){
                try {
                    MainApp.setRoot("listaAutomoveis");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
