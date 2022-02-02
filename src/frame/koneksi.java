package frame;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;

public class koneksi {
    
    private static Connection MySQLConfig;
    
    static Connection config() throws SQLDataException{
        try {
            String url = "jdbc:mysql://localhost:3306/pbo";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e){
            System.out.println("Koneksi gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
}