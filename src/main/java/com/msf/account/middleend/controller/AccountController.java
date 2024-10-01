package com.msf.account.middleend.controller;

import com.msf.account.middleend.domain.Account;
import com.msf.account.middleend.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<Account> getAccount(@PathVariable String id){
        return new ResponseEntity<>(iAccountService.getAccount(id), HttpStatus.OK);
    }

    @GetMapping("/customer/{id}")
    @CrossOrigin
    public ResponseEntity<List<Account>> getAccounts(@PathVariable String id) {
        List<Account> accounts = iAccountService.getAccounts(id);
        if (accounts == null || accounts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }


}
