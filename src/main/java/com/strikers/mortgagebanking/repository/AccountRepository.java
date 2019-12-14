package com.strikers.mortgagebanking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.strikers.mortgagebanking.entity.Account;
import com.strikers.mortgagebanking.entity.Customer;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	@Query("select a from Account a where a.accountNumber LIKE %:accountNumber%")
	List<Customer> findByAccountNumber(@Param("accountNumber") Long accountNumber);

}
