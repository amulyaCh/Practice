package com.practice.firstrest.services;

import org.springframework.stereotype.Service;


import com.practice.firstrest.beans.User;

@Service
public interface UserService {

	public User saveUser(User user);


}


