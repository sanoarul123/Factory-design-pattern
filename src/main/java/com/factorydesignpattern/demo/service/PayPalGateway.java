package com.factorydesignpattern.demo.service;

public class PayPalGateway implements PaymentGateway {
    @Override
    public String processPayment(double amount) {
        return "Processed PayPal payment of " + amount;
    }
}
