package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.Patientdetails;

@Repository
public interface Patientdetailsrepository extends JpaRepository<Patientdetails,Integer>{

}
