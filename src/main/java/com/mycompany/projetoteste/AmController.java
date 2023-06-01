/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoteste;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author samue
 */
public class AmController {
    @FXML
    private LineChart<?, ?> aceleracaoChart;

    @FXML
    private Button finishBtn;

    @FXML
    private Button undoBtn;
    
    @FXML
    private Button submitBtn;
    
    @FXML 
    private Button gerarBtn;
            
    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private TextField textfield4;

    
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Interface 01");
    }
    
    @FXML
    private void switchToThird() throws IOException {
        App.setRoot("Interface 03");
    }
    
    public void gerarDados(){
        double velocidadeInicial = Double.parseDouble(textField1.getText());
        double velocidadeFinal = Double.parseDouble(textField2.getText());
        double tempo = Double.parseDouble(textField3.getText());
        XYChart.Series serie = new XYChart.Series();
        ArrayList <Double> tempos = new ArrayList<>();
        double aceleracao = Formulas.MRUV_Aceleracao(velocidadeInicial, velocidadeFinal, tempo);
        
        for (double i=0;i<=tempo;i++){
            tempos.add(i);
        }
        
        if (aceleracaoChart.getData().isEmpty()){
            for (int i=0; i<tempos.size(); i++){
                serie.getData().add(new XYChart.Data(tempos.get(i),aceleracao));
            }
            aceleracaoChart.getData().addAll(serie);
            textField1.setVisible(false);
            textField2.setVisible(false);
            textField3.setVisible(false);
        }
        else{
            aceleracaoChart.getData().clear();
            textField1.setVisible(true);
            textField2.setVisible(true);
            textField3.setVisible(true);
        }
        
    }
    
}
