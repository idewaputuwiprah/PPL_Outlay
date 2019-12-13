/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;

import java.sql.*;

/**
 *
 * @author idewa
 */
public class DB {
    
    private Connection myConnection;
    
    public DB(){
        
    }
    
    public void init(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            myConnection = DriverManager.getConnection("jbdc:mysql://localhost:3306/outlay","idewaputu","31011999");
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
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
    
    public void submitPengeluaran(String nama, String nominal){
        try{
            Statement st = myConnection.createStatement();
            st.executeUpdate("INSERT INTO pengeluaran(nama,nominal) VALUES('"+nama+"','"+nominal+"')");
        }
        catch(Exception e){
            
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
