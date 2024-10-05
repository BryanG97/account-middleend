package com.msf.account.middleend.domain;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Account {
    private Integer id;

    private String numberAccount;

    private String currencyType;

    private double amount;

    private Integer customerId;

}
