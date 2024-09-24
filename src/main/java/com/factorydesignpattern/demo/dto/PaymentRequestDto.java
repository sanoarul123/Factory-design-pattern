package com.factorydesignpattern.demo.dto;

public class PaymentRequestDto {
    private String gateway;
    private double amount;

    // Getters and setters
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}