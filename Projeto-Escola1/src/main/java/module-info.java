module com.example.projetoescola1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetoescola1 to javafx.fxml;
    exports com.example.projetoescola1;
}