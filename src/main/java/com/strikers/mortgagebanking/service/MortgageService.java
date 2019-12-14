package com.strikers.mortgagebanking.service;

import java.util.List;

import com.strikers.mortgagebanking.entity.Customer;

public interface MortgageService {

	public List<Customer> searchAccount(Integer customerId, Long accountNumber);
}
