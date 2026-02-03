package com.paymentLedger.transaction_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentLedger.transaction_service.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    

}
