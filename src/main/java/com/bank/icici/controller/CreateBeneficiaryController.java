package com.bank.icici.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.icici.bean.Beneficiary;

@RestController
@RequestMapping(path = "/beneficiaries")
public class CreateBeneficiaryController {

	@GetMapping(path = "/add", produces = "application/json")
	public Beneficiary addBeneficiary() {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return beneficiary;

	}
	
	@GetMapping(path = "/update", produces = "application/json")
	public Beneficiary updateBeneficiary() {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return beneficiary;

	}
	
	@GetMapping(path = "/delete", produces = "application/json")
	public Beneficiary deleteBeneficiary() {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return beneficiary;

	}
	
	@GetMapping(path = "/get", produces = "application/json")
	public Beneficiary getBeneficiary() {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return beneficiary;

	}
	
	@GetMapping(path = "/getAll", produces = "application/json")
	public Beneficiary getAllBeneficiary() {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return beneficiary;

	}

}
