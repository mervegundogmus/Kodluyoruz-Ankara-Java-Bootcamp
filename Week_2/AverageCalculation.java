package com.egitim.Week_2;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        double midtermNote, finalNote;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Midterm Note: ");
        midtermNote = scan.nextInt();

        System.out.println("Enter Your Final Note: ");
        finalNote = scan.nextInt();

        double average = (midtermNote * 0.40) + (finalNote * 0.60); //Vize notunun %40'ı Final notunun %60'ı
        System.out.println("Your Average:" + average);

        if(average >= 70 && average < 100){
            System.out.println("Your Letter Grade: AA");
        }
        else if(average >= 50 && average < 70){
            System.out.println("Your Letter Grade: BB");
        }
        else if(average >= 20 && average < 50){
            System.out.println("Your Letter Grade: CB");
        }
        else if(average < 20){
            System.out.println("Your Letter Grade: FF");
        }

    }
}
