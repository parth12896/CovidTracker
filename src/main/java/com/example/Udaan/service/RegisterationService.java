package com.example.Udaan.service;

import com.example.Udaan.model.User;
import com.example.Udaan.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterationService {

    private static int number = 1;

    @Autowired
    private UserRepo userRepo;

    public User registerUser(User user){
        user.setUserId(number++);
        return userRepo.save(user);
    }
}
