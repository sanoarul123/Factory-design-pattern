package com.factorydesignpattern.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentRequestDto {
    private String gateway;
    private double amount;



    public PaymentRequestDto() {
    }

    public PaymentRequestDto(String gateway, double amount) {
        this.gateway = gateway;
        this.amount = amount;
    }

}
