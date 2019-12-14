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
            Class.forName("com.mysql.cj.jdbc.Driver");
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost/outlay?" + 
                                                       "user=root&password=");
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
    
    public void submitPengeluaran(String nama, Integer nominal, Connection conn){
        try{
            Statement st = conn.createStatement();
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
            System.out.println(startDate);
            st.executeUpdate("INSERT INTO pengeluaran (nama,tanggal,nominal) "
                            + "values ('"+nama+"','"+startDate+"','"+nominal+"')",
                            Statement.RETURN_GENERATED_KEYS);
            JOptionPane.showMessageDialog(null,"berhasil input");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"gagal input");
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
