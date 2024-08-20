package com.digimon.DigiList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigiListApplication {

	private static final Logger logger = LoggerFactory.getLogger(DigiListApplication.class);

	public static void main(String[] args) {

		logger.info("DigiList Application up and running ");
		logger.warn("I am warning youuu !!!!!!");
		logger.error("error!");

		SpringApplication.run(DigiListApplication.class, args);
	}
}


