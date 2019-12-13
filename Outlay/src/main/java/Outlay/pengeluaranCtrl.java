/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;

/**
 *
 * @author idewa
 */
public class pengeluaranCtrl {
    
    public pengeluaranCtrl(){
        
    }
    
    public void submitOnClick() {
        String nama = halaman_utama.getName();
        String nominal = halaman_utama.getNumber();
        dbhandler.init();
        dbhandler.submitPengeluaran(nama, nominal);
    }
    
    private DB dbhandler;
    private HalamanUtama halaman_utama;
}
