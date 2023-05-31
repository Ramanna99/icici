package com.bank.icici.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.icici.bean.Beneficiary;

@RestController
@RequestMapping(path = "/beneficiaries")
public class CreateBeneficiaryController {

	@PostMapping(path = "/create", consumes = "application/json")
	public ResponseEntity<Void> addBeneficiary(@RequestBody Beneficiary beneficiary) {

		System.out.println("***********123");
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	/*
	 * @GetMapping(path = "/update", produces = "application/json") public
	 * Beneficiary updateBeneficiary() { Beneficiary beneficiary = new
	 * Beneficiary(); beneficiary.setAccountNumber("47548754875");
	 * beneficiary.setBankName("HDFC Bank"); beneficiary.setIfsccode("HDFC0006475");
	 * beneficiary.setName("John");
	 * 
	 * return beneficiary;
	 * 
	 * }
	 */

	/*
	 * @GetMapping(path = "/delete", produces = "application/json") public
	 * Beneficiary deleteBeneficiary() { Beneficiary beneficiary = new
	 * Beneficiary(); beneficiary.setAccountNumber("47548754875");
	 * beneficiary.setBankName("HDFC Bank"); beneficiary.setIfsccode("HDFC0006475");
	 * beneficiary.setName("John");
	 * 
	 * return beneficiary;
	 * 
	 * }
	 */

	@GetMapping(path = "/get", produces = "application/json")
	public ResponseEntity<Beneficiary> getBeneficiary() {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return new ResponseEntity<Beneficiary>(beneficiary, HttpStatus.OK);

	}

	@GetMapping(path = "/getAll", produces = "application/json")
	public ResponseEntity<List<Beneficiary>> getAllBeneficiary() {

		List<Beneficiary> beneficiaryList = new ArrayList();
		Beneficiary beneficiary1 = new Beneficiary();
		beneficiary1.setAccountNumber("47548754875");
		beneficiary1.setBankName("HDFC Bank");
		beneficiary1.setIfsccode("HDFC0006475");
		beneficiary1.setName("Donald");

		Beneficiary beneficiary2 = new Beneficiary();
		beneficiary2.setAccountNumber("4754875487555");
		beneficiary2.setBankName("SBI");
		beneficiary2.setIfsccode("SBIN00064586");
		beneficiary2.setName("John");

		beneficiaryList.add(beneficiary2);
		beneficiaryList.add(beneficiary1);

		return new ResponseEntity<List<Beneficiary>>(beneficiaryList, HttpStatus.OK);

	}

}
