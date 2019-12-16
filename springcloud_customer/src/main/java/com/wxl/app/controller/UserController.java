package com.wxl.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wxl.app.entity.User;
import com.wxl.app.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private RestTemplate  restTemplate;
	
	@Autowired
	private LoadBalancerClient   loadBalancerClient;
	@Autowired
	private UserService   userService;
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Integer id) {
		
		return this.restTemplate.getForObject("http://springcloud-service/"+id, User.class);
		
	}
	
	//声明式Rest调用
	@GetMapping("/users/{id}")
	public User findByUserId(@PathVariable Integer id) {
		
		return userService.findByUserId(id);
		
	}
	
	
	@GetMapping("log-user-instance")
	public void logUserInstance() {
		
		ServiceInstance  ss = this.loadBalancerClient.choose("springcloud-service");
		System.out.println(ss.getServiceId());
		System.out.println(ss.getHost());
		System.out.println(ss.getPort());
		
	}
	
	
}
