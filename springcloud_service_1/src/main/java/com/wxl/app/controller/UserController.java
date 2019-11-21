package com.wxl.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wxl.app.entity.User;

@RestController
public class UserController {
	
	List<User>  list =  new  ArrayList<>();
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Integer id) {
		User us = new User();
		us.setId(1);
		us.setName("李四");
		us.setAge(18);
		us.setSex(0);
		return us;
	}
}
