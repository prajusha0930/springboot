package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer>{
	  Login findByUsername(String username);

}
