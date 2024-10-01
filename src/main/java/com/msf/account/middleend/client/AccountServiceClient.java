package com.msf.account.middleend.client;

import com.msf.account.middleend.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "account-service")
public interface AccountServiceClient {

    @PostMapping("/api/v1/accounts")
    ResponseEntity<Account> createAccount(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                           @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
                                            @RequestBody Account account);

    @GetMapping("/api/v1/accounts/{id}")
    ResponseEntity<Account> getAccount(@RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
                                        @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
                                         @PathVariable String id);


    @GetMapping("/api/v1/accounts/customer/{id}")
    ResponseEntity<List<Account>> getAccounts(
            @RequestHeader(value = "x-sw-client-request-id", required = true) String xSwClientRequestId,
            @RequestHeader(value = "x-sw-client-request-Type", required = true) String xSwClientRequestType,
            @PathVariable String id
            );

}
