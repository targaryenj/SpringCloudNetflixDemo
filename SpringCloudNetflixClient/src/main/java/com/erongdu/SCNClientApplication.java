package com.erongdu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class SCNClientApplication {
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value="/add",method= RequestMethod.GET)
	public Integer add(@RequestParam Integer a,@RequestParam Integer b) {
		ServiceInstance instance = client.getLocalServiceInstance();
		int result = a+b;
		System.out.println("/add,Host:" + instance.getHost() + ", service_id:" +  instance.getServiceId());
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(SCNClientApplication.class, args);
	}

}
