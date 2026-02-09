package com.paymentLedger.reward_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentLedger.reward_service.entity.Reward;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
    List<Reward> findByUserId(Long userId);
    Boolean existsByTransactionId(Long transactionId);
}

    
