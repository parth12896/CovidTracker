package com.example.Udaan.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
public class SelfAssessment {
    private int userId;
    private List<String> symptoms;
    private boolean travelHistory;
    private boolean contactWithCovidPatient;
}
