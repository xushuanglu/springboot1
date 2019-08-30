package com.example.dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	void saveUser(com.example.mongo.User user);

	com.example.mongo.User findUserByUserName(String userName);

	long updateUser(com.example.mongo.User user);
	
}
