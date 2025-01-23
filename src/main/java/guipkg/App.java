package guipkg;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // load fxml file from Scene builder
        Parent root = FXMLLoader.load(getClass().getResource("project.fxml"));
        // Set Scene for Stage and show
        Scene scene = new Scene(root,900,500);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
