import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ThemDL {
    public static void main(String[] args) {
        KetNoiDL connectJDBC = new KetNoiDL();
        Connection conn = connectJDBC.connect();

        String query = "INSERT INTO products(id,namer,price, detail, manufacture,numbers,statuss ) " +
                "VALUES (?,?,?,?,?,?,?)";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, 11);
            pstm.setString(2, "OPPO");
            pstm.setInt(3, 123456789);
            pstm.setString(4, "Viet Nam");
            pstm.setString(5, "Hai Phong");
            pstm.setInt(6, 1);
            pstm.setString(7, "Con");

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
