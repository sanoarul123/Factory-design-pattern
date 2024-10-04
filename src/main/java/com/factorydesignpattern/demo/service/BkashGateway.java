package com.factorydesignpattern.demo.service;

public class BkashGateway implements PaymentGateway {
    @Override
    public String processPayment(double amount) {
        return "Processed Bkash payment of " + amount;
    }
}
