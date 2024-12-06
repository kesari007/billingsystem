package com.tutofox.demo.service;

import com.tutofox.demo.*;
import com.tutofox.demo.TripPrice.IntraCityPriceStrategy;
import com.tutofox.demo.TripPrice.OutstationPriceStrategy;
import com.tutofox.demo.TripPrice.TripPriceContext;

import java.util.List;

public class BillingService {
    private int calculateTripPrice(Trip trip) {
        Car car = trip.getDriver().getCar();
        int ratePerKm = car.getRatePerKm();
        TripPriceContext tripPriceContext = this.generateTripContext(trip);
        return tripPriceContext.getTripPrice(trip.getDistance(), ratePerKm);
    }

    private TripPriceContext generateTripContext(Trip trip) {
        return TripType.INTRACITY.equals(trip.getTripType()) ?
                new TripPriceContext(new IntraCityPriceStrategy()) :
                new TripPriceContext(new OutstationPriceStrategy());
    }

    public Bill generateBill(Driver driver, List<Trip> trips) {
        int totalAmount = 0;
        for(Trip trip : trips) {
            if(trip.isCancelled()) {
                totalAmount = trip.isCancelledByDriver() ?
                        totalAmount - DemoConstants.CANCELLATION_CHARGE : // These values can be configured at a different place so that we can change it dynamically
                        totalAmount + DemoConstants.CANCELLATION_CHARGE;
            }else {
                totalAmount += this.calculateTripPrice(trip);
            }
        }
        return Bill.builder().amount(totalAmount).driver(driver).build();
    }
}
