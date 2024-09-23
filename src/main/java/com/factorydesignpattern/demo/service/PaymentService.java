package com.factorydesignpattern.demo.service;

import com.factorydesignpattern.demo.entity.Transaction;
import com.factorydesignpattern.demo.repository.TransactionRepository;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private TransactionRepository transactionRepository;

    public String processTransaction(String gatewayType, double amount) {
        PaymentGateway paymentGateway = PaymentGatewayFactory.getPaymentGateway(gatewayType);
        String status = paymentGateway.processPayment(amount);

        Transaction transaction = new Transaction();
        transaction.setGatewayType(gatewayType);
        transaction.setAmount(amount);
        transaction.setStatus(status);

        transactionRepository.save(transaction);

        return status;
    }
}
