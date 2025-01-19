import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtilheirosDAOImpl {
    private Connection connection;

    public ArtilheirosDAOImpl(Connection connection) {
        this.connection = connection;
    }
    public void cadastrarArtilheiro(int timeId, String nome, int gols) throws SQLException {
        String sql = "INSERT INTO Artilheiros_Brasileirao (nome, time_id, gols) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, timeId);
            stmt.setInt(3, gols);
            stmt.executeUpdate();
        }
    }
    public List<Artilheiros> listarArtilheiros() throws SQLException {
        List<Artilheiro> artilheiros = new ArrayList<>();
        String sql = "SELECT * FROM Artilheiros_Brasileirao";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                artilheiros.add(new Artilheiro(rs.getInt("id"), rs.getString("nome"),
                        rs.getInt("time_id"), rs.getInt("gols")));
            }
        }
        return artilheiros;
    }
}

