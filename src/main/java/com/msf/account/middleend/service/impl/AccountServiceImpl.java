package com.msf.account.middleend.service.impl;

import com.msf.account.middleend.client.AccountServiceClient;
import com.msf.account.middleend.domain.Account;
import com.msf.account.middleend.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.apache.tomcat.util.http.parser.HttpParser.isNumeric;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private final AccountServiceClient accountServiceClient;

    @Override
    public Account createAccount(Account account) {
        return accountServiceClient.createAccount("asd","asd",account).getBody();
    }

    @Override
    public Account getAccount(String Id) {
        return accountServiceClient.getAccount("asd","asd",Id).getBody();
    }

    @Override
    public List<Account> getAccounts(String Id) {

        var resultado=  accountServiceClient.getAccounts("sad","asd",Id).getBody();
        return resultado;
    }
}
