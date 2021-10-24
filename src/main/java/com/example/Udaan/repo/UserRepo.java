package com.example.Udaan.repo;

import com.example.Udaan.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer>{

    public List<User> findAllBypinCodeAndCovidPositive(String pincode, boolean covidPositive);
}
