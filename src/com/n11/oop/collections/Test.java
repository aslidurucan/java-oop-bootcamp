package com.n11.oop.collections;

import com.n11.oop.Insan;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("İbrahim");

        Insan i = new Insan();
        if(list.contains(i)) {
            System.out.println("listede var");
        }
        else{
            System.out.println("listede yok");
        }
        ArrayList<Personel> personelListesi = new ArrayList<Personel>();
        Personel p1 = new Personel("hakan" , "yılmaz", 3000);
        Personel p2 = new Personel("metin", "yılmaz", 4000);
        personelListesi.add(p1);
        personelListesi.add(p2);
        personelListesi.add(new Personel("hüseyin", "yıldız", 5000));

        double maasToplami = 0.0;
        for (Personel p : personelListesi) {
            System.out.println("Personelin adı: " + p.ad
            + " soyadı: "  + p.soyad
            + " maaşı: " + p.maas );
            maasToplami += p.maas;
        }
        System.out.println("Toplam maaş: " + maasToplami);
    }
}
