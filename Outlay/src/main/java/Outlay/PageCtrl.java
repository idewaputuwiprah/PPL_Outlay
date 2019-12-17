/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;
import java.sql.*;


/**
 *
 * @author Akmal
 */
public class PageCtrl {
    private DB dbhandler = new DB();
    
    
    
    public void submitOnClick(HalamanAddKategori _halKat) {
        HalamanAddKategori halaman_kategori = _halKat;
        String nama = null;
        String value = null;
        nama = halaman_kategori.getName();
//        value = halaman_kategori.getIcon();
        System.out.println(nama);
//        Integer nominal = Integer.valueOf(nominal_temp);
//        JOptionPane.showMessageDialog(null,"berhasil koneksi");
        Connection connection = dbhandler.init();
        dbhandler.submitKategori(nama, connection);
        balikHalamanKategori1(halaman_kategori);
    }
    
    public void deleteOnClick(HalamanEditKategori hal_edit, int id) {
        HalamanEditKategori halaman_kategori = hal_edit;
//        value = halaman_kategori.getIcon();
//        Integer nominal = Integer.valueOf(nominal_temp);
//        JOptionPane.showMessageDialog(null,"berhasil koneksi");
        Connection connection = dbhandler.init();
        dbhandler.deleteKategori(id, connection);
        balikHalamanKategori2(halaman_kategori);
    }
    
    public Connection getKategori_List(){
        Connection con = dbhandler.init();
        return con;
    }
    
    public void bukaHalamanKategori(HalamanUtama hu){
        HalamanKategori hk = new HalamanKategori();
        hu.setVisible(false);
        hk.setVisible(true);
    }
    
    public void bukaHalamanAddKategori(HalamanKategori hk){
        HalamanAddKategori hak = new HalamanAddKategori();
        hk.setVisible(false);
        hak.setVisible(true);
    }
    
    public void bukaHalamanEditKategori(HalamanKategori hk, String list){
        hk.setVisible(false);
        Connection con = dbhandler.init();
        ResultSet rs = dbhandler.getKategoriT(con, list);
        String id_temp = dbhandler.getIdKategori(rs);
        int id = Integer.parseInt(id_temp);
        String nama = dbhandler.getNamaKategori(rs);
        System.out.println(id);
        System.out.println(nama);
        HalamanEditKategori hek = new HalamanEditKategori(id,nama);
        hek.setVisible(true);
    }
    
    public void updateKategori(HalamanEditKategori hek, String nama, int id){
        Connection con = dbhandler.init();
        dbhandler.updateKategori(nama, id, con);
        balikHalamanKategori2(hek);
    }
        
    
    public void balikHalamanKategori1(HalamanAddKategori hak){
        HalamanKategori hk = new HalamanKategori();
        hak.setVisible(false);
        hk.setVisible(true);
    }
    
    public void balikHalamanKategori2(HalamanEditKategori hek){
        HalamanKategori hk = new HalamanKategori();
        hek.setVisible(false);
        hk.setVisible(true);
    }
}

