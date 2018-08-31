package com.project.FlightZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class FlightZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightZuulApplication.class, args);
	}
}
