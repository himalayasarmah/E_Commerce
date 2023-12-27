module com.example.e_commerce {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;


    opens com.example.e_commerce to javafx.fxml;
    exports com.example.e_commerce;
}