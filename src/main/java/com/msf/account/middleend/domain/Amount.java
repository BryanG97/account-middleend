package com.msf.account.middleend.domain;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Amount {

    Double amount;

    String typeMovement;
}
