package com.msf.account.middleend.service;

import com.msf.account.middleend.domain.Account;

import java.util.List;

public interface IAccountService {

    Account createAccount(Account account);
    Account getAccount(String Id);
    List<Account> getAccounts(String id);
}
