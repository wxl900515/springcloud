package com.wxl.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.wxl.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wxl.app.entity.User;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public User findById(@PathVariable Integer id) {
		List<User>  list =  new  ArrayList<>();
		User us = new User();
		us.setId(2);
		us.setName("李四");
		us.setAge(20);
		us.setSex(1);
		return us;
	}

	@GetMapping("/{id}")
	public User findByIds(@PathVariable Integer id) {
		return userService.findById(id);
	}
}
