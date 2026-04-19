package com.n11.oop;

public class YeniInsan {
    public Kafa kafa;
    public String ad;
    public String soyad;

    public YeniInsan(Kafa kafa, String ad, String soyad){
        this.kafa = kafa;
        this.ad = ad;
        this.soyad = soyad;
    }

    public void ekranaYaz() {
        System.out.println("Kişinin adı: "+ ad + " Soyadı: "+ soyad
        + " Göz rengi: "+ kafa.gozRengi
        + " Kulağı: " + kafa.kulak.sekil
        + " Burnu: "+kafa.burun.tip);
    }
}
