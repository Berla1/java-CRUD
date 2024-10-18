import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/db_teste";
    private static final String user = "root";
    private static final String password = "senha123";

    private static Connection conn;

    public static Connection getConexao(){
        try{
            conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
