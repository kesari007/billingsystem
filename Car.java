package com.tutofox.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    public Car(CarCategory carCategory) {
        this.carCategory = carCategory;
        switch (carCategory) {
            case LUXURY -> this.ratePerKm = 15;
            case PREMIUM -> this.ratePerKm = 12;
            case ECONOMY -> this.ratePerKm = 5;
        }
    }
    private String carNumber;
    private CarCategory carCategory;
    private int ratePerKm;
}
