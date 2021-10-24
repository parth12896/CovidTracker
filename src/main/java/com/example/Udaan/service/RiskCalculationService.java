package com.example.Udaan.service;

import com.example.Udaan.model.SelfAssessment;
import com.example.Udaan.model.User;
import com.example.Udaan.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiskCalculationService {

@Autowired private UserRepo userRepo;


    public double calculateRisk(SelfAssessment self){
        var user = userRepo.findById(self.getUserId()).orElseThrow();
        if (self.getSymptoms().size() == 0 && !self.isTravelHistory() && !self.isContactWithCovidPatient()) {
            user.setRiskPercentage(5.0);
            userRepo.save(user);
            return user.getRiskPercentage();
        }
        if (self.getSymptoms().size() == 1 && self.isTravelHistory() && self.isContactWithCovidPatient()) {
            user.setRiskPercentage(50.0);
            userRepo.save(user);
            return user.getRiskPercentage();
        }
        if (self.getSymptoms().size() == 2 && self.isTravelHistory() && self.isContactWithCovidPatient()) {
            user.setRiskPercentage(75.0);
            userRepo.save(user);
            return user.getRiskPercentage();
        }
        if (self.getSymptoms().size() > 2 && self.isTravelHistory() && self.isContactWithCovidPatient()) {
            user.setRiskPercentage(90.0);
            userRepo.save(user);
            return user.getRiskPercentage();
        }
        return 0.0;
    }

}
