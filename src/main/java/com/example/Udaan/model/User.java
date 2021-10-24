package com.example.Udaan.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    private int userId;
    private String name;
    private String phoneNumber;
    private String pinCode;
    private double riskPercentage;
    private boolean admin;
    private boolean covidPositive;

}
