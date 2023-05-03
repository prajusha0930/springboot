package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.Address;

@Repository
public interface Addressrepository extends JpaRepository<Address,Integer> {

}
