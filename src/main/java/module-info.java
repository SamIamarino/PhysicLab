module com.mycompany.projetoteste {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projetoteste to javafx.fxml;
    exports com.mycompany.projetoteste;
}
