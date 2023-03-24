package com.example.telasescola;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaLoginController {
    @FXML
    public TextField entradaNome;
    @FXML
    public TextField entradaSenha;
    @FXML
    public Label chamada;

    @FXML
    public void EntrarClick(ActionEvent actionEvent) {
        chamada.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void RecuperarSenhaClick(ActionEvent actionEvent) {
        chamada.setText("Welcome to JavaFX Application!");
    }
}
