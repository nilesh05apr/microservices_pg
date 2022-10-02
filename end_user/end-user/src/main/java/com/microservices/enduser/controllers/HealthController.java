package com.microservices.enduser.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public HashMap<String, String> health() {
        HashMap<String, String> map = new HashMap<String, String>();
        Date date = new Date();
        map.put("service-name","end-user-service");
        map.put("status", "ok");
        map.put("time",date.toString());
        return map;
    }
}



