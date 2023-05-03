package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup,Integer> {

}
