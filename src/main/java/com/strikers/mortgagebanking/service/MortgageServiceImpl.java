package com.strikers.mortgagebanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strikers.mortgagebanking.entity.Account;
import com.strikers.mortgagebanking.entity.Mortgage;
import com.strikers.mortgagebanking.repository.AccountRepository;
import com.strikers.mortgagebanking.repository.MortgageRepository;

@Service
public class MortgageServiceImpl implements MortgageService{

	@Autowired
	MortgageRepository mortgageRepository;

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Integer searchAccount(Integer customerId) {
		Account account= accountRepository.findByCustomerId(customerId);
		if(account!=null) {
			
		}
		return customerId;
		
	}
}
