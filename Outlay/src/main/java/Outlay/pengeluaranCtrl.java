/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;

import java.sql.*;
import javax.swing.JOptionPane;
import Outlay.PengeluaranCtrl;
import Outlay.DB;

/**
 *
 * @author idewa
 */
public class PengeluaranCtrl {
    
    public PengeluaranCtrl(){
        
    }
    
    private DB dbhandler = new DB();
    
    public void submitOnClick(HalamanMencatat _halUt) {
        HalamanMencatat halaman_utama = _halUt;
        String nama = null;
        nama = halaman_utama.getName();
        String nominal_temp = null; 
        nominal_temp = halaman_utama.getNumber();
        Integer nominal = Integer.parseInt(nominal_temp);
        System.out.println(nama);
        System.out.println(nominal);
//        Integer nominal = Integer.valueOf(nominal_temp);
//        JOptionPane.showMessageDialog(null,"berhasil koneksi");
        Connection connection = dbhandler.init();
        dbhandler.submitPengeluaran(nama, nominal, connection);
    }

}
