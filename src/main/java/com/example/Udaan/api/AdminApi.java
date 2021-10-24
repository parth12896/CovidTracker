package com.example.Udaan.api;

import com.example.Udaan.model.CovidResults;
import com.example.Udaan.model.User;
import com.example.Udaan.repo.UserRepo;
import com.example.Udaan.service.AdminService;
import com.example.Udaan.service.RegisterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminApi {

    @Autowired
    UserRepo userRepo;

    @Autowired
    RegisterationService registerationService;

    @Autowired
    AdminService adminService;

    @PostMapping("/registerAdmin")
    public User registerUser(@RequestBody User user){
        user.setAdmin(true);
        return registerationService.registerUser(user);
    }

    @PostMapping("/updateCovidResult")
    public boolean updateCovidResult(@RequestBody CovidResults patient){
        return adminService.updateResult(patient);
    }
}
