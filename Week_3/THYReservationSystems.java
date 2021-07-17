package com.egitim.Week_3;
import java.util.Scanner;

public class THYReservationSystems extends FlightReservationSystem {

    public THYReservationSystems() {
        super();
    }
    public THYReservationSystems(int numberOfSeats) {
        super(numberOfSeats);
    }
    public void reservationAl() {
        Scanner input = new Scanner(System.in);
        int seatChoice;
        int seatNumber;
        int selectSeat;
        System.out.println("Press 0 for business or 1 for economy:");
        seatChoice = input.nextInt();

        while (true) {
            if (seatChoice == 0) {
                if (planeIsFull()) {
                    System.out.println("All tickets have been sold...");
                    break;
                }
                if (businessIsFull()) {
                    System.out.println("All bussiness tickets have been sold...");
                    break;
                }
                else {
                    System.out.println("Please select this empty seats.");
                    for (int i = 0; i < 5; i++) {
                        if (!seats[i]) {
                            System.out.print((i + 1) + ".seat is empty\n");
                        }
                    }

                    selectSeat = input.nextInt();
                    if (selectSeat < 0 || selectSeat > 5) {
                        System.out.println("Wrong seat number pleas try again.");
                    }
                    else {
                        seats[selectSeat - 1] = true;
                        System.out.println("Seat Number:" + selectSeat + " " + "Successfully completed!");
                        break;
                    }
                }
            }
            else {
                System.out.println("All tickets have been sold...");
                break;
            }
            if (economiIsFull()) {
                System.out.println("All economy tickets have been sold...");
                break;
            }
            else {
                System.out.println("Please select this empty seats.");
                for (int i = 5; i < numberOfSeats; i++) {
                    if (!seats[i]) {
                        System.out.print((i + 1) + " ");
                    }
                }
                seatChoice = input.nextInt();
            if (seatChoice < 5 || seatChoice > numberOfSeats) {
                System.out.println("Wrong seat number pleas try again.");
            }
            else {
                seats[seatChoice - 1] = true;
                System.out.println("Seat Number:" + seatChoice + " " + "Successfully completed!");
                break;
            }
            }
        }
    }
}

