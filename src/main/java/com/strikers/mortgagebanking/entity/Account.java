package com.strikers.mortgagebanking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "accountsequence", initialValue = 100100)
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountsequence")
	private Long accountNumber;
	private Double balance;
	private String accountType;
	
	
	@OneToOne
	@JoinColumn(name="customer_id")
	Customer customer;
}
