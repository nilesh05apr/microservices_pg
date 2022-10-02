package com.microservices.enduser.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservices.enduser.models.Grade;
import com.microservices.enduser.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GradeController {

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/student")
    public ResponseEntity<String> student (@RequestBody Student student) throws JsonProcessingException {
        String result = restTemplate.postForObject("http://data-aggregation-service/grades", student, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Grade grade = objectMapper.readValue(result, Grade.class);
        return ResponseEntity.status(HttpStatus.OK).body(String.format("Sent student data to data aggregation service: %s \nAnd received:\n%s",student.toString(),grade.toString()));

    }


}
