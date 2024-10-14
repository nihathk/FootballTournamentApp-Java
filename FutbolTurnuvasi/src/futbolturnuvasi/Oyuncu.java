/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolturnuvasi;

/**
 *
 * @author nihat
 */
public class Oyuncu {

    private String isim;
    private String soyisim;
    private String numara;
    private int seviye;

    public String getAd() {
        return isim;
    }

    public void setAd(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyisim;
    }

    public String getNumara() {
        return numara;
    }

    public void setSoyad(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public void setSeviye(int seviye) {
        this.seviye = seviye;
    }

    public int getSeviye() {
        return seviye;
    }

}
