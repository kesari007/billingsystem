package com.tutofox.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Bill {

    private Driver driver;
    private double amount;
}

//Bill


//Seggregratae --> Static -- Dynamic
