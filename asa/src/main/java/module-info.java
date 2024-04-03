module org.example.asa {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.asa to javafx.fxml;
    exports org.example.asa;
}