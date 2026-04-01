module com.example.studentmanager_ale {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanager_ale to javafx.fxml;
    exports com.example.studentmanager_ale;
}