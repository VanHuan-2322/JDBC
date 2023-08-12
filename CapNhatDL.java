import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CapNhatDL {
    public static void main(String[] args) {
        KetNoiDL connectJDBC = new KetNoiDL();
        Connection conn = connectJDBC.connect();

//        String query = "UPDATE products SET detail = ? WHERE id = ? ";
//
//        PreparedStatement pstm = null;
//        try {
//            pstm = conn.prepareStatement(query);
//
//            pstm.setString(1, "du lieu moi");
//            pstm.setInt(2, 4);
//
//            int row = pstm.executeUpdate();
//            if(row != 0){
//                System.out.println("Cập nhật thành công " + row);
//            }
//
//            //Đóng kết nối
//            conn.close();

//        String query = "UPDATE products SET manufacture = ?, price = ? WHERE id = ?";
//
//        PreparedStatement pstm = null;
//        try {
//            pstm = conn.prepareStatement(query);
//
//            pstm.setString(1, "apple");
//            pstm.setInt(2, 12000000);
//            pstm.setInt(3, 2);
//
//            int row = pstm.executeUpdate();
//            if (row != 0) {
//                System.out.println("Cập nhật thành công " + row);
//            }
//
//            // Đóng kết nối
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        String query = "UPDATE products SET numbers = ?, statuss = ? WHERE id = ?";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1,20);
            pstm.setInt(2, 0);
            pstm.setInt(3, 6);

            int row = pstm.executeUpdate();
            if (row != 0) {
                System.out.println("Cập nhật thành công " + row);
            }

            // Đóng kết nối
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
