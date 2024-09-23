package com.factorydesignpattern.demo.service;

public class PaymentGatewayFactory {
    public static PaymentGateway getPaymentGateway(String gatewayType) {
        switch (gatewayType) {
            case "PAYPAL":
                return new PayPalGateway();
            case "STRIPE":
                return new StripeGateway();
            case "SSLCOMMERZ":
                return new SSLCommerzGateway();
            default:
                throw new IllegalArgumentException("Invalid payment gateway: " + gatewayType);
        }
    }
    }