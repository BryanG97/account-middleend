package com.msf.account_middleend.service;

import com.msf.account_middleend.domain.Account;

public interface IAccountService {

    Account createAccount(Account account);

    Account accountById(Integer id);

    Account accountByCustomerId(Integer customerId);

    Account updateAmountById(Integer id);

}
