package com.strikers.mortgagebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.strikers.mortgagebanking.entity.Mortgage;

@Repository
public interface MortgageRepository extends JpaRepository<Mortgage, Integer>{

	Integer findByCustomerId(Integer customerId);

}
