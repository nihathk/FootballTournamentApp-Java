/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolturnuvasi;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author nihat
 */
public class Turnuva {

    public static ArrayList<Takim> takimlar = new ArrayList<Takim>();
    private FileReader reader;
    private File dosya;
    private Takim t;

    public void TakimOlustur(String dosyaYolu) throws IOException {
        dosya = new File(dosyaYolu);
        if (dosya.exists()) {
            reader = new FileReader(dosya);
        } else {
            //dosya yok
        }

        String line = "";
        BufferedReader bReader = new BufferedReader(reader);

        while ((line = bReader.readLine()) != null) {
            if (line.contains("-")) {

                t = new Takim();
                t.setTakimAd(line);
                takimlar.add(t);
            } else {
                Random rnd = new Random();
                String[] oyuncuBilgi = line.split(" ");

                Oyuncu o = new Oyuncu();
                o.setAd(oyuncuBilgi[0]);
                o.setSoyad(oyuncuBilgi[1]);
                o.setNumara(oyuncuBilgi[2]);

                int oyuncuSeviye = rnd.nextInt(10) + 1;
                o.setSeviye(oyuncuSeviye);
                t.setTakimSeviye(t.getTakimSeviye() + o.getSeviye());
                t.oyuncuListe.add(o);
            }
        }
        reader.close();
    }
}
