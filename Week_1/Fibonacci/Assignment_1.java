package com.egitim.Week_1;

import java.util.SortedSet;

//Fibonacci Series
public class Assignment_1 {

    public static void main(String[] args) {

        int num1, num2;
        num1 = 1;
        num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 1; i < 5; i++) { //İkişerli döngü olduğu için ilk 10 sayıyı yazdırıyor

            num1 += num2;
            System.out.print(num1 + " ");

            num2 += num1;
            System.out.print(num2 + " ");

        }
    }
}




