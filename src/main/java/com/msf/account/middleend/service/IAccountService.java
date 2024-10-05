package com.msf.account.middleend.service;

import com.msf.account.middleend.domain.Account;
import com.msf.account.middleend.domain.Amount;
import feign.FeignException;

import java.util.List;

public interface IAccountService {

    Account createAccount(Account customer);

    Account getAccount(String id);

    Account updateAccount(String id, Amount amount);;

    List<Account> getAccounts(String id);

}
