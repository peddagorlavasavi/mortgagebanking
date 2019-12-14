package com.strikers.mortgagebanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strikers.mortgagebanking.service.MortgageService;

@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping("/customers")
public class MortgageController {

	@Autowired
	MortgageService mortgageService;
	
	@GetMapping
	public Integer getMyInterestProfiles(@PathVariable("customerId") Integer customerId) {
		return mortgageService.searchAccount(customerId);
	
	}
}
