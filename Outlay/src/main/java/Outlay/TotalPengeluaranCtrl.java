/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yasinta
 */
public class TotalPengeluaranCtrl {
    public void bukaPengeluaranPerHari(HalamanUtama hu){
        PengeluaranPerHari ph = new PengeluaranPerHari();
        hu.setVisible(false);
        ph.setVisible(true);
    }
    
    public void bukaPengeluaranPerHari(PengeluaranPerHari hu){
        PengeluaranPerMinggu ph = new PengeluaranPerMinggu();
        hu.setVisible(false);
        ph.setVisible(true);
    }
    
    public void showMain(PengeluaranPerHari h)
    {
        HalamanUtama hu = new HalamanUtama();
        h.setVisible(false);
        hu.setVisible(true);
    }
    
    public void isiTabelHari(PengeluaranPerHari perhari)
    {
        DB dbhandler = new DB();
        Connection conn = dbhandler.init();
        ResultSet pengeluaran = dbhandler.getTotal("hari" ,conn);
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("Tanggal");
        model.addColumn("Nama");
        model.addColumn("Nominal");
        
        int i=1;
        int total = 0;
        try{
            while(pengeluaran.next()){
                model.addRow(new Object[]{i++,pengeluaran.getString("tanggal"),pengeluaran.getString("nama"),pengeluaran.getString("nominal")});
                total += Integer.parseInt(pengeluaran.getString("nominal"));	
            }
            perhari.setIsiTabel(model);
            perhari.setIsiTotal("Rp "+total);
        }catch(SQLException e){
            perhari.setIsiTabel(model);
            System.err.println(e);
        }
        
    }
    
    public void isiTabelMinggu(PengeluaranPerMinggu perhari)
    {
        DB dbhandler = new DB();
        Connection conn = dbhandler.init();
        ResultSet pengeluaran = dbhandler.getTotal("minggu" ,conn);
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("Tanggal");
        model.addColumn("Nominal");
        
        int i=1;
        int total = 0;
        try{
            while(pengeluaran.next()){
                model.addRow(new Object[]{i++,pengeluaran.getString("tanggal"),pengeluaran.getString("nominal")});
                total += Integer.parseInt(pengeluaran.getString("nominal"));	
            }
            perhari.setIsiTabel(model);
            perhari.setIsiTotal("Rp "+total);
        }catch(SQLException e){
            perhari.setIsiTabel(model);
            System.err.println(e);
        }
        
    }
    
    public void isiTabelBulan(PengeluaranPerBulan perhari)
    {
        DB dbhandler = new DB();
        Connection conn = dbhandler.init();
        ResultSet pengeluaran = dbhandler.getTotal("bulan" ,conn);
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("Tanggal");
        model.addColumn("Nominal");
        
        int i=1;
        int total = 0;
        try{
            while(pengeluaran.next()){
                model.addRow(new Object[]{i++,pengeluaran.getString("tanggal"),pengeluaran.getString("nominal")});
                total += Integer.parseInt(pengeluaran.getString("nominal"));	
            }
            perhari.setIsiTabel(model);
            perhari.setIsiTotal("Rp "+total);
        }catch(SQLException e){
            perhari.setIsiTabel(model);
            System.err.println(e);
        }
        
    }
    
    public void isiTabelRincian(PengeluaranRincian perhari)
    {
        DB dbhandler = new DB();
        Connection conn = dbhandler.init();
        ResultSet pengeluaran = dbhandler.getTotal("seluruh" ,conn);
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("Tanggal");
        model.addColumn("Nama");
        model.addColumn("Nominal");
        
        int i=1;
        int total = 0;
        try{
            while(pengeluaran.next()){
                model.addRow(new Object[]{i++,pengeluaran.getString("tanggal"),pengeluaran.getString("nama"),pengeluaran.getString("nominal")});
                total += Integer.parseInt(pengeluaran.getString("nominal"));	
            }
            perhari.setIsiTabel(model);
            perhari.setIsiTotal("Rp "+total);
        }catch(SQLException e){
            perhari.setIsiTabel(model);
            System.err.println(e);
        }
        
    }
}
