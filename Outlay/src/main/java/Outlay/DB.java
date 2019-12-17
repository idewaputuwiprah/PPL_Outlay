/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Outlay.PengeluaranCtrl;

/**
 *
 * @author idewa
 */
public class DB {
    
    private Connection myConnection;
    
    public DB(){
        
    }
    
    public Connection init(){
        try{
            String url,name,pass;
            Class.forName("com.mysql.cj.jdbc.Driver");
            url="jdbc:mysql://localhost/outlay?useLegacyDatetimeCode=false&serverTimezone=UTC";  
            name="root";  
            pass="";  
            myConnection = DriverManager.getConnection(url,name,pass);
//            JOptionPane.showMessageDialog(null,"berhasil koneksi");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
//            JOptionPane.showMessageDialog(null,"gagal koneksi");
        }
        return myConnection;
    }
    
//    public Connection getMyConnection(){
//        return myConnection;
//    }
    
    public void getKategori(){
        try{
            Statement st = myConnection.createStatement();
            String q = "Select nama from kategori;";
            ResultSet rs = st.executeQuery(q);
        }
        catch(Exception e){
            System.out.println("Failed to get kategori");
        }
    }
    
    public ResultSet getKategoriT(Connection conn, String value){
        ResultSet rs  = null;
        PreparedStatement ps = null;
//        String temp = "";
        try{
            ps = conn.prepareStatement("select * from kategori where nama = ?");
            ps.setString(1, value);
            rs = ps.executeQuery();
            rs.next();
//            temp = (String) rs.getString("idKategori");
//            System.out.println(temp);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public String getIdKategori(ResultSet rs){
        String temp = "";
        try{
//            rs.next();
            temp = rs.getString("idKategori");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return temp;
    }
    
    public String getNamaKategori(ResultSet rs){
        String temp = "";
        try{
//            rs.next();
            temp = rs.getString("nama");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return temp;
    }
    
    public Integer getIcon(Connection conn, String value){
        Integer id = 0;
        try{
            Statement st = conn.createStatement();
            String q = "select idIcon from icon where nama = '"+value+"'";
            ResultSet rs = st.executeQuery(q);
            String temp = rs.getNString(1);
            id = Integer.parseInt(temp);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    public void submitPengeluaran(String nama, Integer nominal, String value, String des, Connection conn){
        try{
            Statement st = conn.createStatement();
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
//            System.out.println(startDate);
//            Integer id = getKategori(conn, value);
//            System.out.println(id);
            ResultSet rs = getKategoriT(conn, value);
            String id = getIdKategori(rs);
            st.executeUpdate("INSERT INTO pengeluaran (nama,tanggal,nominal,deskripsi,idKategori) "
                            + "values ('"+nama+"','"+startDate+"','"+nominal+"','"+des+"','"+id+"')",
                            Statement.RETURN_GENERATED_KEYS);
            JOptionPane.showMessageDialog(null,"Kamu telah melakukan pengeluaran terhadap kategori " + value);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"gagal input");
        }
    }
    
    public void submitKategori(String nama, Connection conn){
        try{
            Statement st = conn.createStatement();
//            Integer id = getIcon(conn, value);
            st.executeUpdate("INSERT INTO kategori (nama) "
                            + "values ('"+nama+"')",
                            Statement.RETURN_GENERATED_KEYS);
            JOptionPane.showMessageDialog(null,"berhasil input");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"gagal input");
        }
    }
    
    public void updateKategori(String nama, Integer id, Connection conn){
        try{
            Statement st = conn.createStatement();
//            Integer id = getIcon(conn, value);
            st.executeUpdate("update kategori SET nama =  "
                            + "'"+nama+"'" + "where idKategori = " + "'"+id+"'",
                            Statement.RETURN_GENERATED_KEYS);
            JOptionPane.showMessageDialog(null,"berhasil update");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"gagal update");
        }
    }
     
    public void deleteKategori(int id, Connection conn){
        try{
            Statement st = conn.createStatement();
//            Integer id = getIcon(conn, value);
            st.executeUpdate("delete from kategori where idKategori = "
                            + "'"+id+"'",
                            Statement.RETURN_GENERATED_KEYS);
            JOptionPane.showMessageDialog(null,"berhasil delete");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"gagal delete");
        }
    }
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
    public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
    public void destroy(){
  
        if(myConnection !=null){
    
            try{
                myConnection.close();
            }
            catch(Exception e){
            
            }        
        }
    }    
}
