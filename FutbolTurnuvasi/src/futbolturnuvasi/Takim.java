/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolturnuvasi;

import java.util.ArrayList;

/**
 *
 * @author nihat
 */
public class Takim {

    public ArrayList<Oyuncu> oyuncuListe = new ArrayList<Oyuncu>();

    private String takimAd;
    private int takimSeviye;
    private int takimPuan;

    public String getTakimAd() {
        return takimAd;
    }

    public int getTakimPuan() {
        return takimPuan;
    }

    public void setTakimAd(String takimAd) {
        this.takimAd = takimAd;
    }

    public void setTakimSeviye(int takimSeviye) {
        this.takimSeviye = takimSeviye;
    }

    public int getTakimSeviye() {
        return takimSeviye;
    }

    public void setTakimPuan(int takimPuan) {
        this.takimPuan = takimPuan;
    }

}
