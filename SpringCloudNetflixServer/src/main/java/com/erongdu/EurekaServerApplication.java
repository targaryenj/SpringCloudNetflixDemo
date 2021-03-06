package com.erongdu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication extends WebMvcConfigurerAdapter {


	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
