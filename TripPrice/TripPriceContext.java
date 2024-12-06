package com.tutofox.demo.TripPrice;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class TripPriceContext {

    TripPriceStrategy tripPriceStrategy;

    public int getTripPrice(int distance, int ratePerKm) {
        return tripPriceStrategy.calculatePrice(distance, ratePerKm);
    }
}
