import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public void cadastrarUser(User user){
        String sql = "INSERT INTO tb_teste (NOME, IDADE) VALUES(?, ?)";

        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setInt(2, user.getIdade());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
