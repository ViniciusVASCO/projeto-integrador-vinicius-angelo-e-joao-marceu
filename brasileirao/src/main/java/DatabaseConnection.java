import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/brasileirao";
        String user = "info22_vinicius";
        String password = "info22_vinicius";
        return DriverManager.getConnection(url, user, password);
    }
}