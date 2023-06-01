package com.mycompany.projetoteste;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button mruButton;

    @FXML
    private Button mruvButton;

    
   @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("Interface 02");
    }
    
    @FXML
    private void switchToThird() throws IOException {
        App.setRoot("Interface 03");
    }

    
}
