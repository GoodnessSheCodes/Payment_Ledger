package com.paymentLedger.transaction_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paymentLedger.transaction_service.entity.Transaction;

@Service
public interface TransactionService {

    Transaction createTransaction(Transaction transaction);
    
    
    List<Transaction> getAllTransactions();

}
