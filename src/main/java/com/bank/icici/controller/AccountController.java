package com.bank.icici.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.icici.bean.Account;

@RestController
@RequestMapping(path = "/account")
public class AccountController {
	@PostMapping(path = "/create", consumes = "application/json")
	public ResponseEntity<Void> addAccount(@RequestBody Account account) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping(path = "/update", produces = "application/json")
	public ResponseEntity<Account> getAccount() {
		Account account = new Account();
		account.setId("1001");
		account.setFirstName("Hari");
		account.setLastName("Krishna");
		account.setAccountNumber("564563643534");
		account.setBranchName("Ballari");
		account.setBankName("SBI");
		account.setMobileNumber("9676564654");
		account.setEmail("hari@gmail.com");
		account.setIfscCode("SBIN0000779");
		account.setAmount(25000);

		return new ResponseEntity<Account>(account, HttpStatus.OK);

	}

}
