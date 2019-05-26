package com.practice.firstrest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.firstrest.beans.User;

public interface UserRepo extends JpaRepository<User, Long> {



}
