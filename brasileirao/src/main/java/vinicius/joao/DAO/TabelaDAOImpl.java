import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TabelaDAOImpl {
    private Connection connection;

    public TabelaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public List<Tabela> listarTabela() throws SQLException {
        List<Tabela> tabela = new ArrayList<>();
        String sql = "SELECT * FROM Times_Brasileirao ORDER BY pontos DESC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                tabela.add(new Tabela(rs.getInt("id"), rs.getString("nome"),
                        rs.getInt("pontos")));
            }
        }
        return tabela;
    }
}
