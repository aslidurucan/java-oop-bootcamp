package com.n11.oop;

public class Main {
    public static void main(String[] args) {
        Insan i = new Insan();
        i.ad = "İbrahim";
        i.soyad = "Gökyar";
        i.yas = 47;
        i.maas = 3.14;
        i.cinsiyet = true;
        i.uyu();
        i.ekranaYaz(i.ad, i.soyad);

        Cocuk c = new Cocuk();
        c.ad = "Aslı";
        c.soyad = "Durucan";
        c.ekranaYaz(c.ad , c.soyad);

        AkilliCocuk ak = new AkilliCocuk();
        ak.ad = "Hakan";
        ak.soyad = "Yılmaz";
        ak.sifat = "Akıllıdır";
        ak.adSoyadSifatYaz(ak.ad,ak.soyad,ak.sifat);

        UsluCocuk us = new UsluCocuk();
        us.adSoyadSifatYaz("Mehmet", "Yıldız", "Usludur");

        Anne a = new Anne();
        a.ad = "Gülcan";
        a.soyad = "Durucan";
        a.ekranaYaz(a.ad, a.soyad);
        a.oku(a.ad);
        a.yaz(a.ad);
        a.dinle(a.ad);

        Baba b = new Baba();
        b.ad = "Mustafa";
        b.soyad = "Durucan";
        b.ekranaYaz(b.ad, b.soyad);
        b.dinle(b.ad);

        Insan i2 = new Insan("Hakan", "Yılmaz");
        Insan i3 = new Insan("Metin" , "Yıldız" , 33, 3.14, true);
        i2.ekranaYaz(i2.ad, i2.soyad);
        i3.ekranaYaz(i3.ad, i3.soyad);

        String[] gunler = new String[7];
        gunler[0] = "pazartesi";
        gunler[1] = "salı";
        gunler[2] = "çarşamba";
        gunler[3] = "perşembe";
        gunler[4] = "cuma";
        gunler[5] = "cumartesi";
        gunler[6] = "pazar";

        for(int z = 0; z < gunler.length; z++) {
            System.out.println(gunler[z]);
        }
    }
}
