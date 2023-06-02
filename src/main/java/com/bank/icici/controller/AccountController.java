package com.bank.icici.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	@DeleteMapping(path = "/delete", produces = "application/json")
	public ResponseEntity<Account> deleteAccount() {
		Account account = new Account();
		account.setAccountNumber("352763586");
		account.setAmount(15000);
		account.setBankName("State Bank of India");
		account.setBranchName("Alur");
		account.setFirstName("David");
		account.setId("1023");
		account.setIfscCode("SBIN000779");
		account.setLastName("Cross");
		account.setMobileNumber("7892467894");
		account.setEmail("david@1234");
		return new ResponseEntity<Account>(account, HttpStatus.OK);

	}
}
