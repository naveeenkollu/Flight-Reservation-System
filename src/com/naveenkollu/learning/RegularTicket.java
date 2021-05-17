package com.naveenkollu.learning;
import java.util.Date;

public class RegularTicket extends Ticket{
    private boolean specialServices;


    public RegularTicket(Flight f, Passenger p, String from, String to, Date arrivalDateTime, Date departureDateTime, float price, String seatNo, boolean specialServices) {

        super(f, p,  from, to, arrivalDateTime, departureDateTime, price, seatNo);
        this.specialServices = specialServices;

    }
    public boolean getSpecialServices() {

        return this.specialServices;
    }

    public void updateSpecialServices(){

        this.specialServices = specialServices;

    }
}