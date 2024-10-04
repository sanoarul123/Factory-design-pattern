package com.factorydesignpattern.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gatewayType; 
    private double amount;
    private String status;

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getGatewayType() {
        return gatewayType;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Transaction() {
    }

    public Transaction(Long id, String gatewayType, double amount, String status) {
        this.id = id;
        this.gatewayType = gatewayType;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", gatewayType='" + gatewayType + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}



    //public void setGatewayType(String gatewayType) {

    //}

    //public void setAmount(double amount) {
    //}

    //public void setStatus(String status) {
  //  }
//}