package com.paymentLedger.transaction_service.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paymentLedger.transaction_service.entity.Transaction;
import com.paymentLedger.transaction_service.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository repository;
    private final ObjectMapper objectMapper;

    public TransactionServiceImpl(TransactionRepository repository, ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
        this.repository = repository;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        transaction.setTimestamp(LocalDateTime.now());
        transaction.setStatus("success");

        return repository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
    return repository.findAll();
}


}
