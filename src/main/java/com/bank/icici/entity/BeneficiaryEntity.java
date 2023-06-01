package com.bank.icici.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Beneficiary")
public class BeneficiaryEntity {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	//sequence
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ACCOUNTNUMBER")
	private String accountNumber;

	@Column(name = "IFSCCODE")
	private String ifsccode;

	@Column(name = "BANKNAME")
	private String bankName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
