package com.example.dao;

import org.apache.tomcat.jni.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class TestUserRepository {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	public void testBaseQuery() throws Exception {
		User user = new User();
		userRepository.findAll();
		userRepository.findById(1l);
		userRepository.save((org.apache.catalina.User) user);
		userRepository.delete((org.apache.catalina.User) user);
		userRepository.count();
		userRepository.existsById(1l);
		// ...
	}

}
