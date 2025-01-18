package vinicius.joao;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */


public class App extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        System.out.println(getClass());
        FXMLLoader fxTela = new FXMLLoader(getClass().getResource("/resources/views/TelaBrasileirão.fxml"));

        Parent root = fxTela.load();
        scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}