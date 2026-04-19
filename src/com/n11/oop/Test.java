package com.n11.oop;

import com.n11.oop.override.Child;

public class Test {
    public static void main(String[] args) {
        Goz goz = new Goz("Mavi", "retina", 20, 30);
        Kulak kulak = new Kulak("Kepçe");
        Burun burun = new Burun("Kemer");
        Kafa kafa = new Kafa(goz, kulak, burun);
        YeniInsan yeni = new YeniInsan(kafa, "Aslı", "Durucan");
        yeni.ekranaYaz();

        Child c = new Child();
        c.yaz();
    }
}
