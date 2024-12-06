package com.tutofox.demo.service;

import com.tutofox.demo.Car;
import com.tutofox.demo.Driver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverService {

//    @Autowired
//    private CarService carService;
//    private Map<String, Driver> driverMap = new HashMap<>();
//
//    public void addDriversToList(List<Driver> drivers) {
//        drivers.forEach(driver -> driverMap.put(driver.getDriverName(), driver));
//    }
//
//    public void assignDriverToACar(String nameOfDriver, String carId) throws Exception {
//        if(!driverMap.containsKey(nameOfDriver)){
//            throw new Exception("Driver does not exist");
//        } else {
//            Car car = carService.getCarByNumber(carId);
//            Driver driver = driverMap.get(nameOfDriver);
//            driver.setCar(car);
//            driverMap.put(nameOfDriver, driver);
//        }
//    }
}
