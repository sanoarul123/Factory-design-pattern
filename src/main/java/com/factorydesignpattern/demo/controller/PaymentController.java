package com.factorydesignpattern.demo.controller;

import com.factorydesignpattern.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {


    private PaymentService paymentService;

    @PostMapping("/process")

    public String processPayment(@RequestParam String gatewayType, @RequestParam double amount) {
        System.out.println("Processing payment...");
        return paymentService.processTransaction(gatewayType, amount);
    }
}
