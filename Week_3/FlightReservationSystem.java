package com.egitim.Week_3;

public abstract class FlightReservationSystem {
    protected int numberOfSeats =10;
    protected boolean [] seats;

    public FlightReservationSystem(){
        setNumberOfSeats(numberOfSeats);
    }
    public FlightReservationSystem(int numberOfSeats){
        setNumberOfSeats(numberOfSeats);
        this.seats = new boolean[this.numberOfSeats];
    }
    public void setNumberOfSeats(int numberOfSeats){
        if(numberOfSeats <10){
            System.out.println("The number of passengers has been updated to 10.");
            numberOfSeats = 10;
        }else{
            this.numberOfSeats = numberOfSeats;
        }
    }
    public int getNumberOfSeats(){

        return numberOfSeats;
    }
    public boolean economiIsFull(){
        for(int i = 5; i< numberOfSeats; i++) {
            if (!(seats[i])) {
                return false;
            }
        }
        return true;
    }
    public boolean businessIsFull(){
        for(int i=0; i<5;i++) {
            if (!(seats[i])) {
                return false;
            }
        }
        return true;

    }
    public boolean planeIsFull(){
        for(int i = 0; i< numberOfSeats; i++) {
            if(!(seats[i]))
                return false;
        }
        return true;
    }
    public  abstract void reservationAl();
    }

