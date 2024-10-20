package dao.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String url = "jdbc:mysql://localhost:3306/db_teste";
    private static final String user = "root";
    private static final String password = "senha123";

    private static java.sql.Connection conn;

    public static java.sql.Connection getConexao(){
        try{
            conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
