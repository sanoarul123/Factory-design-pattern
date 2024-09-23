package com.factorydesignpattern.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gatewayType;
    private double amount;
    private String status;


    public void setGatewayType(String gatewayType) {
    }

    public void setAmount(double amount) {
    }

    public void setStatus(String status) {
    }
}