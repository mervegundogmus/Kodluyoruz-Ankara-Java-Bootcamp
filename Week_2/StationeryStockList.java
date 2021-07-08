package com.egitim.Week_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
 * Bir kırtasiye dükkanına ürünler geliyor.
 * Kırtasiyeci kalem, silgi gibi malzemelerin kaydını sisteme girecek.
 * 1: Toplam kaç adet ürün aldı?
 * 2: Hangi üründen kaç adet aldı?
 * 3: Kaç çeşit ürünü var?
 */
public class StationeryStockList {
    public static void main(String[] args) {

        HashMap<String, Integer> productArr = new HashMap<>();
        int totalProduct = 0;

        while (true) {
            String productValue = setProduct();
            if (productValue.equals("1")) {
                break;
            }
            if (productArr.getOrDefault(productValue,-1) == -1){
                productArr.put(productValue,1);
            }
            else {
                productArr.replace(productValue,productArr.get(productValue) + 1);
            }
        }

        System.out.println("<<Information of Entered Products>>");
        Iterator it = productArr.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            totalProduct +=(int) pair.getValue();
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("Total number of products: " + totalProduct); //Toplam ürün miktarı
        System.out.println("Total number of categories: " + productArr.size()); //Toplam çeşit sayısı
    }

    public static String setProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<Please quit for enter 1>> \nEnter Product Information :");
        return scanner.nextLine();
    }
}
