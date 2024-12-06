package com.tutofox.demo.TripPrice;

public class OutstationPriceStrategy implements TripPriceStrategy{

    @Override
    public int calculatePrice(int distance, int ratePerKm) {
        return distance * ratePerKm * 2;
    }
}
