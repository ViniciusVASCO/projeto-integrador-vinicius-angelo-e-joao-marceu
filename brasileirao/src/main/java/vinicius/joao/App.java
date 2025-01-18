package vinicius.joao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */


public class App extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        System.out.println(getClass());
        FXMLLoader fxTela = new FXMLLoader(getClass().getResource("/resources/views/TelaMenu.fxml"));

        Parent root = fxTela.load();
        scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}