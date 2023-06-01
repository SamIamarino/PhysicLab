package com.mycompany.projetoteste;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TerciaryController {
    
     @FXML
    private Button aceleracaoBtn;

    @FXML
    private Button sorvetaoBtn;

    @FXML
    private Button toricceliBtn;

    @FXML
    private Button vovoATbtn;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Interface 01");
    }
    
    @FXML
    private void switchToAm() throws IOException { //muda para aceleração media 
        App.setRoot("Interface 04-Am");
    }
    
    @FXML
    private void switchToSorvetao() throws IOException {
        App.setRoot("Interface 04-Sorvetao");
    }
    
    @FXML
    private void switchToTorricelli() throws IOException {
        App.setRoot("Interface 04-Torricelli");
    }
    
    @FXML
    private void switchTovovoAt() throws IOException {
        App.setRoot("Interface 04-vovoAt");
    }
    
}
