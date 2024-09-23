package com.factorydesignpattern.demo.service;

public class SSLCommerzGateway implements PaymentGateway {
    @Override
    public String processPayment(double amount) {
        return "Processed SSLCommerz payment of " + amount;
    }
}
