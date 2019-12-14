package com.strikers.mortgagebanking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strikers.mortgagebanking.entity.Account;
import com.strikers.mortgagebanking.entity.Customer;
import com.strikers.mortgagebanking.repository.AccountRepository;
import com.strikers.mortgagebanking.repository.CustomerRepository;
import com.strikers.mortgagebanking.repository.MortgageRepository;
import com.strikers.mortgagebanking.utils.StringConstant;

@Service
public class MortgageServiceImpl implements MortgageService {

	@Autowired
	MortgageRepository mortgageRepository;

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Account> searchAccount(Integer customerId, Long accountNumber) {
		Customer customer = customerRepository.findCustomerByRole(customerId, StringConstant.ADMIN_ROLE);
		List<Account> list = new ArrayList<>();
		if (customer != null) {
			List<Account> availableList = accountRepository.findByAccountNumber(accountNumber);
			return availableList;
		} else {
			return list;
		}

	}
}
