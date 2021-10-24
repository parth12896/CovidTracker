package com.example.Udaan;

import com.example.Udaan.model.User;
import com.example.Udaan.repo.UserRepo;
import com.example.Udaan.service.RegisterationService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

class TestCase {

@Mock RegisterationService registerationService;
@Mock UserRepo userRepo;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void registerUser(){

        User actual = new User();
        actual.setUserId(1);
        actual.setName("A");
        User expected = new User();
        expected.setUserId(1);
        registerationService.registerUser(actual);
        Mockito.when(userRepo.save(actual)).thenReturn(expected);
        Assertions.assertEquals(actual.getUserId(),expected.getUserId());
    }
}
