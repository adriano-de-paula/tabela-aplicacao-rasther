package com.tecnomotor.tabelarasther.controller;

import com.tecnomotor.tabelarasther.MainApp;
import com.tecnomotor.tabelarasther.constants.Constants;
import com.tecnomotor.tabelarasther.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carregarMontadoras();
    }
    @FXML //Esse método faz toda a verificação das ListView's ao clicar nos dados das listas.
    void handleMouseClick(MouseEvent event) {
        if(lvMontadora.isFocused()) {
            String selectMontadora = lvMontadora.getSelectionModel().getSelectedItem().toString();
            lbMontadora.setText(selectMontadora);

            if(Constants.ALFA_ROMEO.equals(selectMontadora)) {
                carregarVeiculosAlfaRomeu();
            }else {
                limpaLista(lvVeiculo);
                limpaLista(lvMotorizacao);
                limpaLista(lvTipoSistema);
                limpaLista(lvSistema);
                lbVeiculo.setText("");
                lbMotor.setText("");
                lbTipoSistema.setText("");
                lbSistema.setText("");
            }
        }
        if(lvVeiculo.isFocused()){
            String selectVeiculo = lvVeiculo.getSelectionModel().getSelectedItem().toString();
            lbVeiculo.setText(selectVeiculo);

            if(Constants.VEICULO_159.equals(selectVeiculo)) {
                carregarMotorizacao159();
            }else {
                limpaLista(lvMotorizacao);
                limpaLista(lvTipoSistema);
                limpaLista(lvSistema);
                lbMotor.setText("");
                lbTipoSistema.setText("");
                lbSistema.setText("");

            }
        }
        if (lvMotorizacao.isFocused()){
            String selectMotor = lvMotorizacao.getSelectionModel().getSelectedItem().toString();
            lbMotor.setText(selectMotor);

            if (Constants.MOTOR_1916V.equals(selectMotor)){
                carregarTipoSistemas();
            }else {
                limpaLista(lvMotorizacao);
                limpaLista(lvVeiculo);
                lbVeiculo.setText("");
                lbMotor.setText("");;
            }
        }
        if (lvTipoSistema.isFocused()){
            String selectTipoSistema = lvTipoSistema.getSelectionModel().getSelectedItem().toString();
            lbTipoSistema.setText(selectTipoSistema);

            if (Constants.ABS.equals(selectTipoSistema)){
                carregarSistema();
            }else {
                limpaLista(lvSistema);
                lbSistema.setText("");
            }
        }
        if (lvSistema.isFocused()){
            String selectSistema = lvSistema.getSelectionModel().getSelectedItem().toString();

            if (Constants.ABS_DAMAR.equals(selectSistema)){
                lbSistema.setText(selectSistema);
            }else {
                limpaLista(lvSistema);
                lbSistema.setText("");
            }
        }
    }

    //Método para limpar as listas.
    public void limpaLista(ListView<?> lista) {
        lista.getItems().clear();
    }

    //Os métodos criados para criar e carregar os dados das listas.
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

        lvVeiculo.setItems(listVeiculos);
    }


    public void carregarMotorizacao159(){
        listMotorizacao = FXCollections.observableArrayList();

        listMotorizacao.add(new Motor(22,"1.9-16V"));

        lvMotorizacao.setItems(listMotorizacao);
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

        lvTipoSistema.setItems(listTipoSistemas);
    }

    public void carregarSistema(){
        listSistemas = FXCollections.observableArrayList();

        listSistemas.add(new Sistema(1629,"ABS Damar"));

        lvSistema.setItems(listSistemas);

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
