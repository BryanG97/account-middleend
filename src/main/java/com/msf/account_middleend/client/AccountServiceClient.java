package com.msf.account_middleend.client;

import com.msf.account_middleend.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "account-service")
public interface AccountServiceClient {

    @PostMapping("/api/v1/accounts")
    ResponseEntity<Account> createAccount(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                          @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                          @RequestBody Account account);

    @GetMapping("/api/v1/accounts/{id}")
    ResponseEntity<Account> accountById(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                          @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                          @PathVariable("id") Integer id);

    @GetMapping("/api/v1/accounts/{customerId}")
    ResponseEntity<Account> accountByCustomerId(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                          @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                          @PathVariable("customerId") Integer customerId);

    @PutMapping("/api/v1/accounts/{id}/amount")
    ResponseEntity<Account> updateAmountById(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                          @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                          @PathVariable("id") Integer id);

}
