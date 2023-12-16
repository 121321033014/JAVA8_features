package org.example.IRCTC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class trainBookingInformation {
    public static void main(String[] args) {
       List<Train> trains=new ArrayList<>();
       trains.add(new Train("konark Express",3000));
        trains.add(new Train("secundrabad - shalminar",784));
        trains.add(new Train("East Coast Express",567));
        trains.add(new Train("Falaknuma Express (PT)",2981));
        trains.add(new Train("Visakha Express (PT)",1200));
        trains.add(new Train("Hyderabad - cuttack",1550));
        trains.add(new Train("Pune - bhubhaneswar",12701));
        //here we are finding train with most number of bookings by the below code by sending data to stream and compring each other
        Train mostbooking=trains.stream().max(Comparator.comparing(Train::getNoofBookings)).orElse(null);
        if (mostbooking != null) {
            System.out.println("Train with most number of bookings is " + mostbooking.getTrainname() + " with " + mostbooking.getNoofBookings() + " bookings");
        }else{
            System.out.println("No Trains found");
        }
        }

    }

