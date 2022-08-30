module com.example.geekjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires validatorfx;

    opens com.example.geekjava to javafx.fxml;
    exports com.example.geekjava;
}