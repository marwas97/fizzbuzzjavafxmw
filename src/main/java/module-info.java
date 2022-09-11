module com.example.fzibz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fzibz to javafx.fxml;
    exports com.example.fzibz;
}