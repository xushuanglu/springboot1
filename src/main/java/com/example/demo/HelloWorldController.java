package com.example.demo;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/uid")
	String uid(HttpSession session) {
	    UUID uid = (UUID) session.getAttribute("uid");
	    if (uid == null) {
	        uid = UUID.randomUUID();
	    }
	    session.setAttribute("uid", uid);
	    return session.getId();
	}

}
