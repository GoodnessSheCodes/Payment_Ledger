package com.paymentLedger.user_microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paymentLedger.user_microservice.entity.User;
import com.paymentLedger.user_microservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User creatUser(User user) {

       return (User) userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
