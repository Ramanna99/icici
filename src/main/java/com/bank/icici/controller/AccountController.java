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

import com.bank.icici.bean.Account;

@RestController
@RequestMapping(path = "/account")
public class AccountController {
	@PostMapping(path = "/create", consumes = "application/json")
	public ResponseEntity<Void> addAccount(@RequestBody Account account) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping(path = "/getAll", produces = "application/json")
	public ResponseEntity<List<Account>> getAllAccount() {
		List<Account> accountList = new ArrayList<>();
		Account account1 = new Account();
		account1.setId("101");
		account1.setFirstName("Ramu");
		account1.setLastName("V");
		account1.setBranchName("Guntakal");
		account1.setBankName("SBI");
		account1.setEmail("ramu@gmail.com");
		account1.setIfscCode("SBIN0000779");
		account1.setMobileNumber("9703566373");
		account1.setAccountNumber("647864782567");
		account1.setAmount(155876.9);

		Account account2 = new Account();
		account2.setId("102");
		account2.setFirstName("Veeresh");
		account2.setLastName("Yadav");
		account2.setBranchName("Guntakal");
		account2.setBankName("SBI");
		account2.setEmail("ramu@gmail.com");
		account2.setIfscCode("SBIN0000779");
		account2.setMobileNumber("9703566373");
		account2.setAccountNumber("647864782567");
		account2.setAmount(79000);

		Account account3 = new Account();
		account3.setId("103");
		account3.setFirstName("Ramanji");
		account3.setLastName("V");
		account3.setBranchName("Alur");
		account3.setBankName("SBI");
		account3.setEmail("ramanji123@gmail.com");
		account3.setIfscCode("SBIN0000779");
		account3.setMobileNumber("8688181548");
		account3.setAccountNumber("647864782437");
		account3.setAmount(85000);

		Account account4 = new Account();
		account4.setId("104");
		account4.setFirstName("Hari");
		account4.setLastName("Krishna");
		account4.setBranchName("Gooty");
		account4.setBankName("APGB");
		account4.setEmail("hari@gmail.com");
		account4.setIfscCode("APGB008652");
		account4.setMobileNumber("9286372653");
		account4.setAccountNumber("64786478283");
		account4.setAmount(75000);

		Account account5 = new Account();
		account5.setId("105");
		account5.setFirstName("Anil");
		account5.setLastName("Kumar");
		account5.setBranchName("Ballari");
		account5.setBankName("AXIS");
		account5.setEmail("anil@gmail.com");
		account5.setIfscCode("AXIS09887");
		account5.setMobileNumber("9912210388");
		account5.setAccountNumber("647864768757");
		account5.setAmount(50000);

		accountList.add(account1);
		accountList.add(account2);
		accountList.add(account3);
		accountList.add(account4);
		accountList.add(account5);

		return new ResponseEntity<List<Account>>(accountList, HttpStatus.OK);
	}
	@GetMapping(path = "/get", produces = "application/json")
	public ResponseEntity<Account> getAccount() {
		Account account1 = new Account();
		account1.setId("111");
		account1.setFirstName("V.Ramu");
		account1.setLastName("Vadde");
		account1.setBranchName("Bellary");
		account1.setBankName("Axis Bank");
		account1.setEmail("vadde.ramu@gmail.com");
		account1.setIfscCode("SBIN00005566");
		account1.setMobileNumber("9703566373");
		account1.setAccountNumber("446242652424");
		account1.setAmount(50000.09);

		return new ResponseEntity<Account>(account1, HttpStatus.OK);
}
}