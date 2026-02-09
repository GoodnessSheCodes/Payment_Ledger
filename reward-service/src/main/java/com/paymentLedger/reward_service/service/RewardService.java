package com.paymentLedger.reward_service.service;

import java.util.List;

import com.paymentLedger.reward_service.entity.Reward;

public interface RewardService {

    Reward sendReward(Reward reward);
    List<Reward> getRewardsByUserId(Long UserId);

}
