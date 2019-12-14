package com.strikers.mortgagebanking.service;

import java.util.List;

import com.strikers.mortgagebanking.entity.Account;
import com.strikers.mortgagebanking.entity.Customer;
public interface MortgageService {

	public List<Account> searchAccount(Integer customerId, Long accountNumber);
}
