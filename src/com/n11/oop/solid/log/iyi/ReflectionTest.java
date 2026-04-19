package com.n11.oop.solid.log.iyi;

import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Log tipini girin (DbLog / XmlLog / TextLog): ");
        String logTipi = scanner.nextLine();

        try {
            String tamYol = "com.n11.oop.solid.log.iyi." + logTipi;
            Class<?> clazz = Class.forName(tamYol);

            ILog logNesnesi = (ILog) clazz.getDeclaredConstructor().newInstance();

            Logger logger = new Logger(logNesnesi);
            logger.LogYaz("303 nolu hata oluştu");

        } catch (ClassNotFoundException e) {
            System.out.println("'" + logTipi + "' adında bir log tipi bulunamadı!");
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
