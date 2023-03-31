module com.example.telasescola {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.telasescola to javafx.fxml;
    exports com.example.telasescola;
}