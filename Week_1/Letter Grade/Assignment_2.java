package com.egitim.Week_1;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args){

        double average;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Average:");
        average = scan.nextInt();

        if(average > 90){
            System.out.println("Your Letter Grade: A1");
        }
        else if(average > 80 && average < 90){
            System.out.println("Your Letter Grade: A2");
        }
        else if(average > 70 && average < 80){
            System.out.println("Your Letter Grade: B1");
        }
        else if(average > 65 && average < 70){
            System.out.println("Your Letter Grade: B2");
        }
        else if(average > 60 && average < 65){
            System.out.println("Your Letter Grade: C");
        }
        else if(average < 60){
            System.out.println("Your Letter Grade: F3");
        }

    }
}
