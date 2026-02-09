package com.paymentLedger.reward_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentLedger.reward_service.entity.Reward;
import com.paymentLedger.reward_service.repository.RewardRepository;

@RestController
@RequestMapping("/api/rewards/")
public class RewardController {

    private final RewardRepository rewardRepository;

    public RewardController(RewardRepository rewardRepository) {
        this.rewardRepository = rewardRepository;
    }

    // 🔹 Get all rewards
    @GetMapping
    public List<Reward> getAllRewards() {
        return rewardRepository.findAll();
    }

    // 🔹 Get rewards by user ID
    @GetMapping("/user/{userId}")
    public List<Reward> getRewardsByUserId(@PathVariable Long userId) {
        return rewardRepository.findByUserId(userId);
    }


}
