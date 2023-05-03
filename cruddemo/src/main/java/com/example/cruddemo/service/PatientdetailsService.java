package com.example.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruddemo.model.Patientdetails;
import com.example.cruddemo.repository.Patientdetailsrepository;

@Service
public class PatientdetailsService {

	@Autowired
	Patientdetailsrepository pr;
	public List<Patientdetails> getDetails() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}
	public Patientdetails postDetails(Patientdetails id)
	{
		return pr.save(id);
	}

	
}
