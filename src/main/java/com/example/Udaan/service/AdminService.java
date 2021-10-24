package com.example.Udaan.service;

import com.example.Udaan.model.CovidResults;
import com.example.Udaan.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    UserRepo userRepo;

    public boolean updateResult(CovidResults patient){
        var user = userRepo.findById(patient.getUserId()).orElseThrow();
        var admin = userRepo.findById(patient.getAdminId()).orElseThrow();

        if (!admin.isAdmin()){
            return false;
        }
        user.setCovidPositive(Boolean.parseBoolean(patient.getResult().toString()));
        userRepo.save(user);
        return true;
    }
}
