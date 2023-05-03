package com.example.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruddemo.model.Signup;
import com.example.cruddemo.service.SignupService;

@RestController
public class SignupController {
	
	@Autowired
	SignupService ss;
	
	@GetMapping("get")
	public List<Signup> getAllDetails(){
		
		return ss.getAllDetails();
	}
	
	@PostMapping("/post")
	
	public Signup postDetails(@RequestBody Signup id) {
		
		return ss.postDetails(id);
	}

}
