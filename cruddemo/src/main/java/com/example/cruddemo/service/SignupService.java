package com.example.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruddemo.model.Signup;
import com.example.cruddemo.repository.SignupRepository;

@Service
public class SignupService {

	@Autowired
	SignupRepository sr;

	public List<Signup> getAllDetails() {
		
		return sr.findAll();
	}

	public Signup postDetails(Signup id) {
		
		return sr.save(id);
	}
}
