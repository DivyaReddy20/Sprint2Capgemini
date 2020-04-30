package com.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class BookingFlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingFlightsApplication.class, args);
	}

}
