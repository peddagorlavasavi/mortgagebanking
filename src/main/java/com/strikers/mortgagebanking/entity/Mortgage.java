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
@Table(name = "mortgage")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "mortgagesequence", initialValue = 200002000)
public class Mortgage {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mortgagesequence")
	private Integer mortgageId;
	private String mortgageType;
	private Double interest;
	private Double amount;
	private Integer tenure;
	private Double emi;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private Account customer;

}
