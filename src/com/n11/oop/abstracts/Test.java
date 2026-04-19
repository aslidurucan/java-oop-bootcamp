package com.n11.oop.abstracts;

public class Test {
    public static void main(String[] args) {
        Kedi k = new Kedi();
        k.hareketEt();


        GenelMudur gm = new GenelMudur();
        gm.ad = "Hakan";
        gm.soyad = "Yılmaz";
        gm.departman = "Genel Müdür";

        Mudur m = new Mudur();
        Programci p = new Programci();
        Stajyer s = new Stajyer();

        double toplam = gm.maasinizNedir() + m.maasinizNedir() +
                p.maasinizNedir() + s.maasinizNedir();
        System.out.println("Toplam: " + toplam + " TL maaş alıyolar");

        Calisan[] calisanlar = new Calisan[4];
        calisanlar[0] = gm;
        calisanlar[1] = m;
        calisanlar[2] = p;
        calisanlar[3] = s;

        for ( int j = 0; j < calisanlar.length ; j++){
            System.out.println("Çalışanın adı : "+ calisanlar[j].ad
            + "Soyadı: " + calisanlar[j].soyad
            + "Maaşı: " + calisanlar[j].maasinizNedir());
        }

        Matematik ma = new Matematik();
        int ikiSayi = ma.topla(5,5);
        int ucSayi = ma.topla(5,5,5);
        System.out.println("İki sayının toplamı: " + ikiSayi);
        System.out.println("Üç sayının toplamı: " + ucSayi);
    }
}
