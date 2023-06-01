package com.mycompany.projetoteste;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class VmController {
   
    @FXML
    private LineChart<?, ?> chart;

    @FXML
    private Button finishBtn;

    @FXML
    private Button submitBtn;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private TextField textField4;

    @FXML
    private Button undoBtn;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Interface 01");
    }
    
    @FXML
    private void switchToSecond() throws IOException {
        App.setRoot("Interface 02");
    }
    
    @FXML
    public void gerarDados(){
        double espacoInicial = Double.parseDouble(textField1.getText());
        double espacoFinal = Double.parseDouble(textField2.getText());
        double tempo = Double.parseDouble(textField3.getText());
        XYChart.Series serie = new XYChart.Series();
        ArrayList <Double> tempos = new ArrayList<>();
        double velocidade = Formulas.MRU_Velocidade(espacoInicial, espacoFinal, tempo);
        
        for (double i=0;i<=tempo;i++){
            tempos.add(i);
        }
        
        if (chart.getData().isEmpty()){
            for (int i=0; i<tempos.size(); i++){
                serie.getData().add(new XYChart.Data(tempos.get(i),velocidade));
            }
            chart.getData().addAll(serie);
            textField1.setVisible(false);
            textField2.setVisible(false);
            textField3.setVisible(false);
        }
        else{
            chart.getData().clear();
            textField1.setVisible(true);
            textField2.setVisible(true);
            textField3.setVisible(true);
        }
        
    }
}
