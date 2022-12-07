package com.tecnomotor.tabelarasther.controller;

import com.tecnomotor.tabelarasther.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;


public class TelaPrincipalController {
    @FXML
    private Button btnCategoria;
/*
    Nesta Classe controladora que é a tela inicial do projeto, temos um botão para exibir as categorias.
 */
    @FXML
    protected void onButtonClick() throws IOException {
        MainApp.setRoot("categoria");
    }
}