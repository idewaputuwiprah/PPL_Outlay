/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;
import Outlay.DB;
import Outlay.HalamanKategori;
import Outlay.HalamanUtama;

/**
 *
 * @author Akmal
 */
public class PageCtrl {
    private DB dbhandler = new DB();
    
    public void bukaHalamanKategori(HalamanUtama hu){
        HalamanKategori hk = new HalamanKategori();
        hu.setVisible(false);
        hk.setVisible(true);
    }
    
}

