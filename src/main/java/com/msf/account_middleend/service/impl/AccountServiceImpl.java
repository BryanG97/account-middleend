package com.msf.account_middleend.service.impl;

import com.msf.account_middleend.client.AccountServiceClient;
import com.msf.account_middleend.domain.Account;
import com.msf.account_middleend.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private final AccountServiceClient accountServiceClient;

    @Override
    public Account createAccount(Account account) {
        return accountServiceClient
                .createAccount("asd", "asdasd", account).getBody();
    }

    @Override
    public Account accountById(Integer id) {
        return accountServiceClient
                .accountById("asd", "asdasd",id).getBody();
    }

    @Override
    public Account accountByCustomerId(Integer customerId) {
        return accountServiceClient
                .accountByCustomerId("asd", "asdasd",customerId).getBody();
    }

    @Override
    public Account updateAmountById(Integer id) {
        return accountServiceClient
                .updateAmountById("asd", "asdasd",id).getBody();
    }
}
