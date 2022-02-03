module com.jktm.taksapp.taskappjava17 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jktm.taksapp.taskappjava17 to javafx.fxml;
    exports com.jktm.taksapp.taskappjava17;
}