module guipkg {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens guipkg to javafx.fxml;
    exports guipkg;
}
