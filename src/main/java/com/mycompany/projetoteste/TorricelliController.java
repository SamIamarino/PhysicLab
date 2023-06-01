package com.mycompany.projetoteste;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TorricelliController {
    @FXML
    private Button finishBtn;

    @FXML
    private TextField aceleracaoField;
    
    @FXML
    private TextField resultadoField;
    
    @FXML
    private TextField velocidadeField;

    @FXML
    private TextField deltaField;
    
    @FXML
    private Button submitBtn;

    @FXML
    private Button undoBtn;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Interface 01");
    }
    
    @FXML
    private void switchToThird() throws IOException {
        App.setRoot("Interface 03");
    }
    
    @FXML
    public void gerarDados(){
        double velocidadeInicial = Double.parseDouble(velocidadeField.getText());
        double aceleracao = Double.parseDouble(aceleracaoField.getText());
        double DeltaS = Double.parseDouble(deltaField.getText());
        
        double velocidade = Formulas.MRUV_Torricelli(velocidadeInicial, aceleracao, DeltaS);
        resultadoField.setText(Double.toString(velocidade));
        resultadoField.setEditable(false);
        resultadoField.setMouseTransparent(true);
        resultadoField.setFocusTraversable(false);
    }
}
