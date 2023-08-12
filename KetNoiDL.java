import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiDL {
    private String hostName = "127.0.0.1:3306";
    private String dbName = "product_manager_database";
    private String username = "root";
    private String password = "1234";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}