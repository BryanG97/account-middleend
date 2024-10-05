package com.msf.account.middleend.client;

import com.msf.account.middleend.domain.Account;
import com.msf.account.middleend.domain.Amount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "account-service")
public interface AccountServiceClient {

    @PostMapping("/api/v1/accounts")
    ResponseEntity<Account> createAccount(@RequestHeader(value = "x-sw-client-request-id", required = true) String xCmClientRequestId,
                                          @RequestHeader(value = "x-sw-client-request-type", required = true) String xCmClientRequestType,
                                          @RequestBody Account Account);

    @GetMapping("/api/v1/accounts/{id}")
    ResponseEntity<Account> getAccount(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                       @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
                                       @PathVariable String id);

    @PutMapping("/api/v1/accounts/{id}")
    ResponseEntity<Account> updateAccount(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                       @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
                                       @PathVariable String id,
                                       @RequestBody Amount amount);

    @GetMapping("/api/v1/accounts/customer/{id}")
    ResponseEntity<List<Account>> getAccounts(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                              @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
                                              @PathVariable String id);
}
