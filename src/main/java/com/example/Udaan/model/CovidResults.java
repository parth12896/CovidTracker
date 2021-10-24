package com.example.Udaan.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class CovidResults {
    private int userId;
    private int adminId;

    @Enumerated(EnumType.STRING)
    private ResultType result;
}
