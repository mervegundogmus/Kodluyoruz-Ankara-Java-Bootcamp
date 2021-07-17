package com.egitim.Week_3;
import java.util.Scanner;

public class ReservationSystem {

    public static void main(String[] args) {

        FlightReservationSystem pegasusReservationSystem = new PegasusReservationSystem(10);
        Scanner input = new Scanner(System.in);
        String inputKey = "1";

        while(inputKey.equals("1") ){
            pegasusReservationSystem.reservationAl();
            System.out.println("\nPlease press 1 to continue or press 0 to exit");
            inputKey = input.next();
        }
    }
}
