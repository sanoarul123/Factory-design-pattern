package com.factorydesignpattern.demo.service;

public class StripeGateway implements PaymentGateway {
    @Override
    public String processPayment(double amount) {
        return "Processed Stripe payment of " + amount;
    }
}
