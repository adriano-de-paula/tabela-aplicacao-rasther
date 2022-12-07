package com.tecnomotor.tabelarasther.controller;

import com.tecnomotor.tabelarasther.MainApp;
import com.tecnomotor.tabelarasther.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListaAutomoveisController implements Initializable {
    @FXML private Label lbMontadora;
    @FXML private Label lbVeiculo;
    @FXML private Label lbMotor;
    @FXML private Label lbTipoSistema;
    @FXML private Label lbSistema;
    @FXML private ListView<Montadora> lvMontadora;
    @FXML private ListView<Veiculo> lvVeiculo;
    @FXML private ListView<Motor> lvMotorizacao;
    @FXML private ListView<TipoSistema> lvTipoSistema;
    @FXML private ListView<Sistema> lvSistema;

    private ObservableList<Montadora> listMontadoras;
    private ObservableList<Veiculo> listVeiculos;
    private ObservableList<Motor> listMotorizacao;
    private ObservableList<TipoSistema> listTipoSistemas;
    private ObservableList<Sistema> listSistemas;

    //Método que foi herdado ao implementar o 'Initializable', nesse caso está carregando os dados das ListView's
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carregarMontadoras();
        carregarVeiculosAlfaRomeu();
        carregarMotorizacao159();
        carregarTipoSistemas();
        carregarSistema();
    }
/*
    Aqui temos os métodos para carregar os dados das list's
 */
    public void carregarMontadoras(){
        listMontadoras = FXCollections.observableArrayList();

        listMontadoras.addAll(
                new Montadora(29,"ALFA ROMEO", Categoria.LEVES),
                new Montadora(17,"AUDI", Categoria.LEVES),
                new Montadora(18,"BMW", Categoria.LEVES),
                new Montadora(59,"CHERY/RELY", Categoria.LEVES),
                new Montadora(30,"CHRYSLER", Categoria.LEVES),
                new Montadora(19,"CITROEN", Categoria.LEVES),
                new Montadora(38,"CN AUTO", Categoria.LEVES),
                new Montadora(31,"DAEWOO", Categoria.LEVES),
                new Montadora(28,"DODGE", Categoria.LEVES),
                new Montadora(79,"EFFA", Categoria.LEVES),
                new Montadora(14,"FIAT", Categoria.LEVES),
                new Montadora(1,"FORD", Categoria.LEVES),
                new Montadora(24,"GENERICA/OBD II", Categoria.LEVES),
                new Montadora(15,"GM", Categoria.LEVES),
                new Montadora(68,"GREAT WALL", Categoria.LEVES),
                new Montadora(21,"HONDA", Categoria.LEVES),
                new Montadora(20,"HYUNDAI", Categoria.LEVES),
                new Montadora(37,"IMOB AVANÇADO", Categoria.LEVES),
                new Montadora(70,"IVECO", Categoria.LEVES),
                new Montadora(58,"JAC", Categoria.LEVES),
                new Montadora(32,"JEEP", Categoria.LEVES),
                new Montadora(33,"KIA", Categoria.LEVES),
                new Montadora(71,"LAND ROVER", Categoria.LEVES),
                new Montadora(77,"LIFAN", Categoria.LEVES),
                new Montadora(69,"MAHINDRA", Categoria.LEVES),
                new Montadora(34,"MAZDA", Categoria.LEVES),
                new Montadora(76,"MERCEDES", Categoria.LEVES),
                new Montadora(80,"MINI", Categoria.LEVES),
                new Montadora(22,"MITSUBISHI", Categoria.LEVES),
                new Montadora(23,"NISSAN", Categoria.LEVES),
                new Montadora(25,"PEUGEOT", Categoria.LEVES),
                new Montadora(26,"RENAULT", Categoria.LEVES),
                new Montadora(67,"SSANGYONG", Categoria.LEVES),
                new Montadora(35,"SUZUKI", Categoria.LEVES),
                new Montadora(27,"TOYOTA", Categoria.LEVES),
                new Montadora(12,"TROLLER", Categoria.LEVES),
                new Montadora(36,"VOLVO", Categoria.LEVES),
                new Montadora(16,"VM", Categoria.LEVES)
        );

        lvMontadora.setItems(listMontadoras);
    }

    public void carregarVeiculosAlfaRomeu(){

        listVeiculos = FXCollections.observableArrayList();

        listVeiculos.addAll(
                new Veiculo(1057,"159"),
                new Veiculo(1089,"Giulietta"),
                new Veiculo(1097,"Mito"),
                new Veiculo(434,"156"),
                new Veiculo(430,"145"),
                new Veiculo(431,"146"),
                new Veiculo(432,"155"),
                new Veiculo(435,"166")
        );

            /* Ao clicar em um dado da lista ele pega o nome do item selecionado e transfere
             para um label embaixo da lista. */
            lvMontadora.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    String selectMontadora = lvMontadora.getSelectionModel().getSelectedItem().toString();
                    lvVeiculo.setItems(listVeiculos);
                    lbMontadora.setText(selectMontadora);
                }
            });
    }

    public void carregarMotorizacao159(){
        listMotorizacao = FXCollections.observableArrayList();

        listMotorizacao.add(new Motor(22,"1.9-16V"));

        lvVeiculo.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String selectVeiculo = lvVeiculo.getSelectionModel().getSelectedItem().toString();
                lvMotorizacao.setItems(listMotorizacao);
                lbVeiculo.setText(selectVeiculo);
            }
        });
    }

    public void carregarTipoSistemas(){
        listTipoSistemas = FXCollections.observableArrayList();

        listTipoSistemas.addAll(
                new TipoSistema(2,"ABS"),
                new TipoSistema(3,"Airbag"),
                new TipoSistema(32,"Ajuda de estacionamento"),
                new TipoSistema(5,"Carroceria"),
                new TipoSistema(14,"Climatização"),
                new TipoSistema(30,"Controle das portas"),
                new TipoSistema(1,"Motor Diesel"),
                new TipoSistema(13,"Painel")
        );

        lvMotorizacao.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String selectMotor = lvMotorizacao.getSelectionModel().getSelectedItem().toString();
                lvTipoSistema.setItems(listTipoSistemas);
                lbMotor.setText(selectMotor);
            }
        });
    }

    public void carregarSistema(){
        listSistemas = FXCollections.observableArrayList();

        listSistemas.add(new Sistema(1629,"ABS Damar"));

        lvTipoSistema.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String selectTipoSistema = lvTipoSistema.getSelectionModel().getSelectedItem().toString();
                lvSistema.setItems(listSistemas);
                lbTipoSistema.setText(selectTipoSistema);
            }
        });

        lvSistema.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String selectSistema = lvSistema.getSelectionModel().getSelectedItem().toString();
                lbSistema.setText(selectSistema);
            }
        });
    }

    /* Ação ao clicar no botão 'Aplicar' que mostra um alert de confirmação para aplicação do
    Rasther com os dados selecionados anteriomente */
    public void mostrarAplicacao(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Aplicação do Rasther");
        alert.setContentText("Confirma a aplicação");

        String selectMontadora = lvMontadora.getSelectionModel().getSelectedItem().toString();
        lbMontadora.setText(selectMontadora);
        String selectVeiculo = lvVeiculo.getSelectionModel().getSelectedItem().toString();
        lbVeiculo.setText(selectVeiculo);
        String selectMotor = lvMotorizacao.getSelectionModel().getSelectedItem().toString();
        lbMotor.setText(selectMotor);
        String selectTipoSistema = lvTipoSistema.getSelectionModel().getSelectedItem().toString();
        lbTipoSistema.setText(selectTipoSistema);
        String selectSistema = lvSistema.getSelectionModel().getSelectedItem().toString();
        lbSistema.setText(selectSistema);

        alert.setContentText(selectMontadora +"\\"+ selectVeiculo +"\\"+ selectMotor +"\\"+ selectTipoSistema +"\\"+ selectSistema);
        alert.showAndWait();

        lbMontadora.setText("");
        lbVeiculo.setText("");
        lbMotor.setText("");
        lbTipoSistema.setText("");
        lbSistema.setText("");
    }

    //Ao clicar em 'voltar' a aplicação volta a tela de categorias.
    public void voltarTelaAnterior(ActionEvent event) throws IOException {
        MainApp.setRoot("categoria");
    }
}
