import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public void postUser(User user){
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
    public List<User> getUsers(){
        String sql = "SELECT * FROM tb_teste";
        List<User> users = new ArrayList<User>();

        PreparedStatement ps = null;
        ResultSet rset = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            rset = ps.executeQuery();

            while(rset.next()){
                User user = new User();
                user.setId(rset.getInt("id"));
                user.setNome(rset.getString("nome"));
                user.setIdade(rset.getInt("idade"));
                users.add(user);
            }
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public void updateUser(User user) {
        String sql = "UPDATE tb_teste SET nome = ?, idade = ? WHERE id = ?";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setInt(2, user.getIdade());
            ps.setInt(3, user.getId());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUser(int id){
        String sql = "DELETE FROM tb_teste WHERE id = ?";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
