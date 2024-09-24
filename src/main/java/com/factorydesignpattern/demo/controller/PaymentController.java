package com.factorydesignpattern.demo.controller;

import com.factorydesignpattern.demo.dto.PaymentRequestDto;
import com.factorydesignpattern.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

@Autowired
    private PaymentService paymentService;

    @PostMapping("/process")

    public String processPayment(@RequestBody PaymentRequestDto paymentRequest) {
        System.out.println("Processing payment...");
        return paymentService.processTransaction(paymentRequest.getGateway(), paymentRequest.getAmount());
    }
}
