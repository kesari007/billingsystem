package com.tutofox.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Trip {
    private Driver driver;
    private TripType tripType;
    private int distance;
    private boolean isCancelled;
    private boolean isCancelledByDriver;
}
