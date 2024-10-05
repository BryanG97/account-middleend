package com.msf.account.middleend.service.impl;


import com.msf.account.middleend.client.AccountServiceClient;
import com.msf.account.middleend.domain.Account;
import com.msf.account.middleend.domain.Amount;
import com.msf.account.middleend.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private final AccountServiceClient accountServiceClient;

    @Override
    public Account createAccount(Account account) {
        return accountServiceClient
                .createAccount("xCmClientRequestIdMiddleend","xCmClientRequestTypeMiddleend",account).getBody();
    }

    @Override
    public Account getAccount(String id) {
        return accountServiceClient
                .getAccount("xCmClientRequestIdMiddleend","xCmClientRequestTypeMiddleend", id).getBody();
    }

    @Override
    public Account updateAccount(String id, Amount amount) {
        return accountServiceClient
                .updateAccount("xCmClientRequestIdMiddleend","xCmClientRequestTypeMiddleend", id, amount).getBody();
    }

    @Override
    public List<Account> getAccounts(String id) {
        return accountServiceClient
                .getAccounts("xCmClientRequestIdMiddleend","xCmClientRequestTypeMiddleend", id).getBody();
    }
}
