package com.example.cruddemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruddemo.model.Login;
import com.example.cruddemo.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository userRepo;

	public Login saveUser(Login u) {
		// TODO Auto-generated method stub
		return userRepo.save(u);
	}

public String validateUser(String username,String password)
{
	String result="";
	Login u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
}
