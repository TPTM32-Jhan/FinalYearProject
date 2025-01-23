import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class gui extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        StackPane root = FXMLLoader.load(getClass().getResource("your_layout.fxml"));

        // Set the scene and show the window
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
