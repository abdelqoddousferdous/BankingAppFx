module com.example.bankingappfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bankingappfx to javafx.fxml;
    exports com.example.bankingappfx;
}