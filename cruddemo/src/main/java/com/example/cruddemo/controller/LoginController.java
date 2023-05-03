package com.example.cruddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruddemo.model.Login;
import com.example.cruddemo.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService usrService;
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody Login u)
		{
		//System.out.println(u.getUsername());
			return usrService.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	    public  Login details(@RequestBody Login u)
	    {
	       return usrService.saveUser(u);
	    }
}

