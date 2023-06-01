package com.mycompany.projetoteste;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SorvetaoController {

    @FXML
    private Button finishBtn;

    @FXML
    private LineChart<?, ?> lineChart;

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
    private void switchToThird() throws IOException {
        App.setRoot("Interface 03");
    }
    
    @FXML
    public void gerarDados(){
        double espacoInicial = Double.parseDouble(textField1.getText());
        double velocidadeInicial = Double.parseDouble(textField2.getText());
        double aceleracao = Double.parseDouble(textField3.getText());
        double tempo = Double.parseDouble(textField4.getText());
        XYChart.Series serie = new XYChart.Series();
        ArrayList <Double> tempos = new ArrayList<>(); 
        ArrayList <Double> espacos = new ArrayList<>(); 
        
        for (double i=0;i<=tempo;i++){
            tempos.add(i);
            espacos.add(Formulas.MRUV_Espaco(espacoInicial, velocidadeInicial, i, aceleracao));
        }
        
        if (lineChart.getData().isEmpty()){
            for (int i=0; i<tempos.size(); i++){
                serie.getData().add(new XYChart.Data(tempos.get(i),espacos.get(i)));
            }
            lineChart.getData().addAll(serie);
            textField1.setVisible(false);
            textField2.setVisible(false);
            textField3.setVisible(false);
            textField4.setVisible(false);
        }
        else{
            lineChart.getData().clear();
            textField1.setVisible(true);
            textField2.setVisible(true);
            textField3.setVisible(true);
            textField4.setVisible(true);
        }
    }

}
