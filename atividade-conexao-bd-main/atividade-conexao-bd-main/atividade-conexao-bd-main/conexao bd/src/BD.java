package cap12;
import java.sql.*;
public class BD {
    public Connection connection = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DBNAME = "banco";
    private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "";
    /**
     * método que faz conexão com o banco de dados retorna true se houve
     * sucesso, ou false em caso negativo
     */
    public boolean getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println(("Conectou"));
            return true;
        } catch (ClassNotFoundException erro) {
            System.out.println("Driver não encontrado " + erro.toString());
            return false;
        } catch (SQLException e) {

            System.out.println("Driver não encontrado " + e.toString());
            return false;
        }
    }
    public void close() {
        try {
            connection.close();
            System.out.println("Desconectou");
        } catch (SQLException erro) {

        }
    }

}
