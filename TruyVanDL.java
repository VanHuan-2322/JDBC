import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TruyVanDL {
    public static void main(String[] args) {
       KetNoiDL connectJDBC = new KetNoiDL();
        Connection conn = connectJDBC.connect();
        String query = "SELECT * FROM products";

        Statement stm = null;
        try {
            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                int id = rs.getInt("id");
                String namer = rs.getString("namer");
                String price = rs.getString("price");
                String detail = rs.getString("detail");
                String manufacture = rs.getString("manufacture");
                String numbers =rs.getString("numbers");
                String statuss= rs.getString("statuss");
                System.out.println(id + " - " + namer + " - " + price + " - " + detail+ " - "
                        + manufacture+ " - " + numbers + " - "+ statuss + " - ");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
