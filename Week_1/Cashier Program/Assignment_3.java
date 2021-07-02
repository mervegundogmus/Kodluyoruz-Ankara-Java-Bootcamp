package com.egitim.Week_1;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args){

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        double armutTutar, elmaTutar, domatesTutar, muzTutar, patlicanTutar, toplamTutar;

        Scanner scan = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        armutKg = scan.nextInt();
        armutTutar = armutFiyat * armutKg;

        System.out.println("Elma Kaç Kilo ? :");
        elmaKg = scan.nextInt();
        elmaTutar = elmaFiyat * elmaKg;


        System.out.println("Domates Kaç Kilo ? :");
        domatesKg = scan.nextInt();
        domatesTutar = domatesFiyat * domatesKg;

        System.out.println("Muz Kaç Kilo ? :");
        muzKg = scan.nextInt();
        muzTutar = muzFiyat * muzKg;

        System.out.println("Patlıcan Kaç Kilo ? :");
        patlicanKg = scan.nextInt();
        patlicanTutar = patlicanFiyat * patlicanKg;

        toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;
        System.out.println("Toplam Tutar: "+toplamTutar+" TL");

    }
}
