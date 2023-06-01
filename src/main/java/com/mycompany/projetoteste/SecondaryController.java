package com.mycompany.projetoteste;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {

    @FXML
    private Button sorvete;

    @FXML
    private Button velocidadeMedia;

    @FXML
    private Button volta1;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Interface 01");
    }
    
    @FXML
    private void switchToVm() throws IOException {
        App.setRoot("Interface 04-Vm");
    }
    
    @FXML
    private void switchToSorvete() throws IOException {
        App.setRoot("Interface 04-Sorvete");
    }
    
}
