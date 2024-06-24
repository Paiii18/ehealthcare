package koneksi;

import java.sql.*;

public class koneksi {

    private Connection koneksi;

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi " + ex);
        }
        String url = "jdbc:mysql://localhost:3306/ehealthcare";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil Koneksi Database");
        } catch (SQLException ex) {
            System.out.println("Gagal Koneksi Database " + ex);
        }
        return koneksi;
    }

    public static void main(String[] args) {
        koneksi conn = new koneksi();
        conn.connect();
    }
}
