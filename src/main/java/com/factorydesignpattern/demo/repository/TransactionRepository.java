package com.factorydesignpattern.demo.repository;

import com.factorydesignpattern.demo.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}