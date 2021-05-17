import java.sql.*;
import java.util.ArrayList;

public class VeriTabani {

    private Connection baglan() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Nyat",
                    "postgres", "538508ks");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    ArrayList<String> Kisiler = new ArrayList<String>();
    ArrayList<String> Sifreler = new ArrayList<String>();
    private String kullaniciAdi= null;
    private String sifre = null;

    VeriTabani() throws SQLException
    {

        Connection conn = baglan();
        String sql = "SELECT \"Ad\",  \"Sifre\"  FROM \"Kullanici\"";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        conn.close();

        while(rs.next())
        {
            kullaniciAdi  = rs.getString("Ad");
            sifre = rs.getString("Sifre");
            Kisiler.add(kullaniciAdi);
            Sifreler.add(sifre);
        }

        rs.close();
        stmt.close();
    }

    public boolean girisYap(String kullaniciadi, String sifre) throws SQLException, InterruptedException
    {
        for (int i = 0; i < Kisiler.size(); i++) {
            if (Kisiler.get(i).compareTo(kullaniciAdi) == 0 && Sifreler.get(i).compareTo((sifre)) == 0) {
                return true;
            }
        }
        System.out.println("Kullanici Dogrulanamadi");
        return false;
    }

}


