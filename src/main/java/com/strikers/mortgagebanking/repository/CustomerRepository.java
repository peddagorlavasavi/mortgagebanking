package com.strikers.mortgagebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.strikers.mortgagebanking.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("select c from Customer c where c.customerId=:customerId and c.role=:role")
	Customer findCustomerByRole(@Param("customerId") Integer customerId, @Param("role") String role);

}
