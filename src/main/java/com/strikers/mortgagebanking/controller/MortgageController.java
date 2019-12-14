package com.strikers.mortgagebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.strikers.mortgagebanking.entity.Account;
import com.strikers.mortgagebanking.entity.Customer;
import com.strikers.mortgagebanking.service.MortgageService;

@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping("/customers")
public class MortgageController {

	@Autowired
	MortgageService mortgageService;

	@GetMapping("{customerId}")
	public List<Account> getMyInterestProfiles(@PathVariable("customerId") Integer customerId, @RequestParam Long accountNumber) {
		return mortgageService.searchAccount(customerId, accountNumber);

	}
}
