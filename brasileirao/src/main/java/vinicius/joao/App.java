package vinicius.joao;

import vinicius.joao.model.dao.ArtilheirosDAOImpl;
import vinicius.joao.model.dao.TimesDAOImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App extends Application {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/brasileirao";
        String user = "info22_vinicius";
        String password = "info22_vinicius";
        return DriverManager.getConnection(url,user, password);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxTela = new FXMLLoader(getClass().getResource("/resources/views/TelaBrasileirao.fxml"));
        Parent root = fxTela.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

        try (Connection connection = getConnection()) {
            TimesDAOImpl timesDAO = new TimesDAOImpl(connection);
            Artilheiros artilheirosDAO = new ArtilheirosDAOImpl(connection);

            timesDAO.cadastrarTime("Vasco da Gama", "RJ", "Rio de Janeiro");
            artilheirosDAO.cadastrarArtilheiro(1, " Felipe Coutinho", 11);

        } catch (SQLException e) {
            e.printStackTrace();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
}