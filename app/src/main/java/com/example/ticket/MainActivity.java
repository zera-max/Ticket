package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RailwayTicket railwayTicket = new RailwayTicket(70, 9);
    RailwayTicket railwayTicketChild = new RailwayTicketChild(70,11, 50);
    RailwayTicket railwayTicketPensioner = new RailwayTicketPensioner(70,5,30);

    private TextView railwayTicketOut;
    private TextView railwayTicketChildOut;
    private TextView railwayTicketPensionerOut;
    private  TextView railwayTicketTotalOut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        railwayTicketOut = findViewById(R.id.railwayTicketOut);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketPensionerOut = findViewById(R.id.railwayTicketPensionerOut);

        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + "монет");
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll()) + "монет");
        railwayTicketPensionerOut.setText(Float.toString(railwayTicketPensioner.ticketPriceAll()) + "монет");
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll() + railwayTicketPensioner.ticketPriceAll()) + "монет");

    }
}