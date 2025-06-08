
package DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/CacaoPrime";
    private static final String USER = "root";
    private static final String PASS = ""; // Cambia si tu MySQL tiene clave

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
