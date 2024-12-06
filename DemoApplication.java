package com.tutofox.demo;

import com.tutofox.demo.service.BillingService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class DemoApplication {
		// Allen Digital ==> Queztion -->

	public static void main(String[] args) throws Exception {
		Car car = new Car(CarCategory.PREMIUM);

		Driver driver = new Driver(12345,"Ramesh","9936673011", car);

		Trip trip = Trip.builder().tripType(TripType.INTRACITY).distance(10).driver(driver).isCancelled(false).isCancelledByDriver(false).build();
		Trip trip2 = Trip.builder().tripType(TripType.OUTSTATION).distance(24).driver(driver).isCancelled(false).isCancelledByDriver(false).build();
		Trip trip3 = Trip.builder().tripType(TripType.INTRACITY).distance(0).driver(driver).isCancelled(true).isCancelledByDriver(true).build();
		Trip trip4 = Trip.builder().tripType(TripType.OUTSTATION).distance(0).driver(driver).isCancelled(true).isCancelledByDriver(false).build();

		List<Trip> tripList = List.of(trip,trip2,trip3,trip4);

		BillingService billingService = new BillingService();
		Bill bill = billingService.generateBill(driver, tripList);

		System.out.println("The bill for the driver is " + bill.getAmount());
	}
}
