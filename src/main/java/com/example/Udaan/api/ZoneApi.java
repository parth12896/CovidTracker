package com.example.Udaan.api;

import com.example.Udaan.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ZoneApi {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/getZoneInfo")
    public Map<String, String> getInfo(@RequestBody String pincode){
       var size = userRepo.findAllBypinCodeAndCovidPositive(pincode,true).size();
        Map<String,String> info = new HashMap<>();
        info.put("numCases", String.valueOf(size));
        if (size== 0){
            info.put("zoneType","Green");
            return info;
        }
       if (size<5){
           info.put("zoneType","Orange");
           return info;
       }
       if (size>5){
            info.put("zoneType","Red");
           return info;
       }
       return info;
    }
}
