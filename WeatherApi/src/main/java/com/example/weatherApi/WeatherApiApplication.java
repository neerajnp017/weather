package com.example.weatherApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class WeatherApiApplication {

	// Logger logger = Logger.getLogger(WeatherApiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}

}
