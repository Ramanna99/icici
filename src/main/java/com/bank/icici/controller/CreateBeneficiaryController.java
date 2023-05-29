package com.bank.icici.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/beneficiaries")
public class CreateBeneficiaryController {

	public CreateBeneficiaryController() {
		System.out.println("#################");
	}

	@GetMapping(path="/add", produces = "application/json")
	public String hello() {
		System.out.println("************");
		return "Welcome to Spring-boot icici app";

	}

}
