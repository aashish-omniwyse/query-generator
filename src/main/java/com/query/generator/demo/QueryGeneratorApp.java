package com.query.generator.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class QueryGeneratorApp {
	private static final Logger logger = LoggerFactory.getLogger(QueryGeneratorApp.class);

	public static void main(String[] args) {
		SpringApplication.run(QueryGeneratorApp.class, args);
		logger.info("Query Generator application started...");
	}
}
