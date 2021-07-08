package com.egitim.Week_2;

import java.util.Scanner;

/*
Sinema Bileti Satışı :
-18 yaş altı için %10
-18 ve 25 yaş arası %5 indirim
-Korku filmi seçimi %10 indirim
 */
public class TicketSales {
    static int price = 100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        System.out.print("Choose if the movie category is horror enter 1: ");
        int scary = scan.nextInt();


        if(age < 18){
            double newPrice = price - ( price * 0.10); /*18 yaş altına korku kategorisi yasak */
            System.out.println("Your Ticket Price: " + newPrice + "TL");
        }

        else if(age >= 18 && age <=25 && scary != 1){ /*18 yaşından büyük 25 yaşından küçük ve eşit diğer kategoriler*/
            double newPrice = price - ( price * 0.10);
            System.out.println("Your Ticket Price: " + newPrice + "TL");
        }

        else if(age >= 18 && age <=25 && scary == 1){ /*18 yaşından büyük 25 yaşından küçük ve eşit korku kategorisi*/
            double newPrice = price - ( price * 0.15);
            System.out.println("Your Ticket Price: " + newPrice + "TL");
        }

        else if(age > 25 && scary != 1){ /*25 yaşından büyük diğer kategoriler*/
            double newPrice = price;
            System.out.println("Your Ticket Price: " + price + "TL");
        }

        else if(age > 25 && scary == 1){ /*25 yaşından büyük korku kategorisi*/
            double newPrice = price - ( price * 0.10);
            System.out.println("Your Ticket Price: " + price + "TL");
        }

    }
}
