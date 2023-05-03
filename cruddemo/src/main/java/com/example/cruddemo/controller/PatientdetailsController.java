package com.example.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruddemo.model.Patientdetails;
import com.example.cruddemo.service.PatientdetailsService;

@RestController
public class PatientdetailsController {
       @Autowired
       PatientdetailsService ps;
       @GetMapping("/ids")
       public List<Patientdetails> get()
       {
    	   return ps.getDetails();
       }
       @PostMapping("/saved")
       public Patientdetails postDetails(@RequestBody Patientdetails id)
       {
    	   return ps.postDetails(id);
       }
       
}
