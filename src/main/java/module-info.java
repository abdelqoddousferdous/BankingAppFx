module com.example.bankingappfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankingappfx to javafx.fxml;
    exports com.example.bankingappfx;
}