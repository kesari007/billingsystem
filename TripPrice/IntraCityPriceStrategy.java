package com.tutofox.demo.TripPrice;

public class IntraCityPriceStrategy implements TripPriceStrategy{
    @Override
    public int calculatePrice(int distance, int ratePerKm) {
        return distance * ratePerKm;
    }
}
