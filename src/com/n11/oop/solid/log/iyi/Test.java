package com.n11.oop.solid.log.iyi;

public class Test {
    public static void main(String[] args) {
        Logger logger = new Logger(new TextLog());
        logger.LogYaz("303 nolu hata kodu oluştu");
    }

}
