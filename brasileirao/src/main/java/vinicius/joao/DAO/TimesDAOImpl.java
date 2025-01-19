import java.sql.*;

public class TimesDAOImpl {
    private Connection connection;

    public TimesDAOImpl(Connection connection) {
        this.connection = connection;
    }
    public Time getTimeById(int id) throws SQLException {
        String sql = "SELECT * FROM Times_Brasileirao WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Time(rs.getInt("id"), rs.getString("nome"),
                        rs.getString("estado"), rs.getString("cidade"),
                        rs.getInt("pontos"));
            }
        }
        return null;
    }
}


