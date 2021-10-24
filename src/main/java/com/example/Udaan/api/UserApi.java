package com.example.Udaan.api;

import com.example.Udaan.model.SelfAssessment;
import com.example.Udaan.model.User;
import com.example.Udaan.service.RegisterationService;
import com.example.Udaan.service.RiskCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @Autowired
    RegisterationService registerationService;

    @Autowired
    RiskCalculationService riskCalculationService;


    @PostMapping("/registerUser")
    public User registerUser(@RequestBody User user){
        return registerationService.registerUser(user);
    }

    @PostMapping("/selfAssessment")
    public double calculateRisk(@RequestBody SelfAssessment assessment){
        return riskCalculationService.calculateRisk(assessment);
    }
}
