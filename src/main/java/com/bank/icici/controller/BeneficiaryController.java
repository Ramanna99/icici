package com.bank.icici.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.icici.bean.Beneficiary;
import com.bank.icici.entity.BeneficiaryEntity;
import com.bank.icici.repo.BeneficiaryRepository;
import com.bank.icici.util.EntityMapping;

@RestController
@RequestMapping(path = "/beneficiary")
public class BeneficiaryController {

	@Autowired
	private BeneficiaryRepository beneficiaryRepository;

	@Autowired
	private EntityMapping entityMapping;

	@PostMapping(path = "/create", consumes = "application/json")
	public ResponseEntity<Void> addBeneficiary(@RequestBody Beneficiary beneficiary) {

		BeneficiaryEntity beneficiaryEntity = entityMapping.mapBeneficiaryEntity(beneficiary);
		beneficiaryRepository.save(beneficiaryEntity);
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	@PutMapping(path = "/update/{benfId}", produces = "application/json")
	public Beneficiary updateBeneficiary(@PathParam("benfId") String benfId) {

		System.out.println("Update benfId:" + benfId);
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return beneficiary;

	}

	@PatchMapping(path = "/updatePart/{benfId}", produces = "application/json")
	public Beneficiary updateBeneficiaryPartial(@PathParam("benfId") String benfId) {

		System.out.println("updatePart benfId:" + benfId);
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return beneficiary;

	}

	@DeleteMapping(path = "/delete/{benfId}")
	public ResponseEntity<Beneficiary> deleteBeneficiary(@PathParam("benfId") String benfId) {
		System.out.println("Delete benfId:" + benfId);
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber("47548754875");
		beneficiary.setBankName("HDFC Bank");
		beneficiary.setIfsccode("HDFC0006475");
		beneficiary.setName("John");

		return new ResponseEntity<Beneficiary>(beneficiary, HttpStatus.OK);

	}

	@GetMapping(path = "/get/{benfId}", produces = "application/json")
	public ResponseEntity<Beneficiary> getBeneficiary(@PathParam("benfId") String benfId) {
		System.out.println("Get benfId:" + benfId);
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
