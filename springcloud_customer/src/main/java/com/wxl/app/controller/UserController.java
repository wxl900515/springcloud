package com.wxl.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wxl.app.entity.User;

@RestController
public class UserController {

	
	@Autowired
	private RestTemplate  restTemplate;
	
	@Autowired
	private LoadBalancerClient   loadBalancerClient;
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Integer id) {
		
		return this.restTemplate.getForObject("http://springcloud-service/"+id, User.class);
		
	}
	
	
	@GetMapping("log-user-instance")
	public void logUserInstance() {
		
		ServiceInstance  ss = this.loadBalancerClient.choose("springcloud-service");
		System.out.println(ss.getServiceId());
		System.out.println(ss.getHost());
		System.out.println(ss.getPort());
		
	}
	
	
}
