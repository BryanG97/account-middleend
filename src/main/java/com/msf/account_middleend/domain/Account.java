package com.msf.account_middleend.domain;

import lombok.Data;

@Data
public class Account {

    private Integer id;

    private String numberAccount;

    private String currencyType;

    private Double amount;

    private Integer customerId;

}
