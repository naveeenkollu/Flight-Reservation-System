package com.naveenkollu.learning;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Flight flight = new Flight("17555", "Lufthansa", 500);
        System.out.println("Airlines: " + flight.getAirline());
        System.out.println("Flight No. " + flight.getFlightNumber());
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.incrementBookingCounter());

        System.out.println(flight.checkAvailability());

        Passenger passenger = new Passenger("Shamshabad", "Hyderabad", "Telangana" , "Lewis Hamilton","9842454420", "lewishamilton_worldchampion@f1.com");
        Date d1 = new Date(2021, 05, 12);
        Date d2 = new Date(2021, 05, 13);

        System.out.println(passenger.getPassengerCount());
        System.out.println(passenger.getEmail());
        System.out.println(passenger.getName());



        RegularTicket r = new RegularTicket(flight, passenger, "Kerala", "Hyderabad", d2, d1, 3597, "32", false);
        System.out.println("Opted for Special Services: "+ r.getSpecialServices());
        String[] location = {"a", "b"};
        TouristTicket t = new TouristTicket(flight, passenger, "Kerala", "Goa", d2, d1, 2995, "seat2", "Vivanta", location);
        printTicketDetails(r);
        printTicketDetails(t);



        System.out.println(t.checkStatusOfFLight());
        System.out.println(t.checkStatus());




    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());

    }
}