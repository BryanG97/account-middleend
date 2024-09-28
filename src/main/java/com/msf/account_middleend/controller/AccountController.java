package com.msf.account_middleend.controller;

import com.msf.account_middleend.domain.Account;
import com.msf.account_middleend.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final IAccountService iAccountService;

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return new ResponseEntity<>(iAccountService.createAccount(account), HttpStatus.CREATED);
    }

    @GetMapping()
    @CrossOrigin
    public ResponseEntity<Account> accountById(@PathVariable  Integer id) {
        return new ResponseEntity<>(iAccountService.accountById(id), HttpStatus.CREATED);
    }

    @GetMapping()
    @CrossOrigin
    public ResponseEntity<Account> accountByCustomerId(@PathVariable  Integer customerId) {
        return new ResponseEntity<>(iAccountService.accountByCustomerId(customerId), HttpStatus.CREATED);
    }

    @PutMapping()
    @CrossOrigin
    public ResponseEntity<Account> updateAmountById(@PathVariable  Integer id) {
        return new ResponseEntity<>(iAccountService.updateAmountById(id), HttpStatus.CREATED);
    }

}
