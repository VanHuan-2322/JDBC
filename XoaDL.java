import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class XoaDL {
    public static void main(String[] args) {
        KetNoiDL connectJDBC = new KetNoiDL();
        Connection conn = connectJDBC.connect();

        String query = "DELETE FROM products WHERE id = ?";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, 11);

            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Xóa thành công " + row);
            }

            //Đóng kết nối
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
