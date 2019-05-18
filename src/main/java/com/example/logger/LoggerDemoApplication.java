package com.example.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class LoggerDemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(LoggerDemoApplication.class);
	public static void main(String[] args) throws Exception {
		SpringApplication.run(LoggerDemoApplication.class, args);
		
		LOGGER.info("This is information");
		LOGGER.debug("This is debug");
		LOGGER.error("This is error");
	}

}
