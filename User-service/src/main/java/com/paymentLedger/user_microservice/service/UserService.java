package com.paymentLedger.user_microservice.service;
import com.paymentLedger.user_microservice.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User creatUser(User user);

    Optional<User> getUserById(Long id);
    // To avoid NullPointerException and force safer code.maybe this user exists maybe they dont 

   List<User> getAllUsers();
}