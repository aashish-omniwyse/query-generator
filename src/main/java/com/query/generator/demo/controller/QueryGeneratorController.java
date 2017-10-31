package com.query.generator.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.query.generator.demo.service.QueryGeneratorService;


@RestController
public class QueryGeneratorController {
	private final static Logger logger = LoggerFactory.getLogger(QueryGeneratorController.class);

	@Autowired
	QueryGeneratorService queryGenerator;
	
	@RequestMapping(value="/generate",method = RequestMethod.GET)
	public ResponseEntity<?> prepareQuery(@RequestParam("criteria") String criteria) {
		logger.info("request reach to endpoint with param : "+criteria);
		return new ResponseEntity<>(queryGenerator.generateCriteria(criteria),HttpStatus.OK);
	}
}
