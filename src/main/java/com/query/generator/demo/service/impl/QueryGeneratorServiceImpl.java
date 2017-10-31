package com.query.generator.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.management.QueryExp;

import org.springframework.stereotype.Service;

import com.query.generator.demo.service.QueryGeneratorService;

@Service("queryGenerator")
public class QueryGeneratorServiceImpl implements QueryGeneratorService{
	
	@Override
	public Map<String, String> generateCriteria(String criteria) {
		Map<String, String> generatedCriteria = new HashMap<>();
		String[] arr = criteria.split(" ");

		if (arr[0].equalsIgnoreCase("who")) {
			generatedCriteria.put("item", "PEOPLE");
			generatedCriteria.put("field_name", "person_name");
			generatedCriteria.put("field_value", arr[arr.length - 1]);
		} else if (arr[0].equalsIgnoreCase("where")) {
			generatedCriteria.put("item", "PLACE");
			generatedCriteria.put("field_name", "place_name");
			generatedCriteria.put("field_value", arr[arr.length - 1]);
		}
		return generatedCriteria;
	}
}
