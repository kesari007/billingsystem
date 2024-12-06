package com.tutofox.demo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Driver {

    private int driverId;
    private String driverName;
    private String contactNo;
    private Car car;
}
