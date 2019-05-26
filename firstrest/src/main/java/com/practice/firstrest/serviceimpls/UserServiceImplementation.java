package com.practice.firstrest.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.firstrest.beans.User;
import com.practice.firstrest.repos.UserRepo;
import com.practice.firstrest.services.UserService;

@Service
public class UserServiceImplementation implements UserService {

	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
        
		System.out.println(user.getName());
	
		return userRepo.save(user);
	}

}
