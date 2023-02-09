package com.example.ticket;

public class RailwayTicketPensioner extends RailwayTicket {
    private float ticketDiscount;

    public RailwayTicketPensioner() {
    }
    public RailwayTicketPensioner(float ticketPrice, int numberOfTickets, float ticketDiscount){
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }
    public  float ticketPriceAll() {
        return  (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100;
    }
}
