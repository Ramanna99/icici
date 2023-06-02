package com.bank.icici.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	
}
