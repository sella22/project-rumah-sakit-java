/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class cetak {

    static ResultSet rs;

    public static void main(String[] args) {
        String tampil = "";
        try {

            //mengambil data dari tabel pasien
            java.sql.Connection conn = koneksi.config();
            String sql = "";
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            sql = "SELECT * FROM pasien";
            rs = pstm.executeQuery(sql);

            // tampilkan hasil query
            while (rs.next()) {
                JadwalBerobat_oop jb2 = new JadwalBerobat_oop(rs.getInt("id_ps"),
                        rs.getString("nama_ps"), rs.getString("jadwal_ps"), rs.getString("dokter_ps"));
                tampil += "\n" + jb2.data() + "\n";
            }
            JOptionPane.showMessageDialog(null, "Data Pasien" + "\n" + tampil + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
