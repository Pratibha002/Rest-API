package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.restController")
public class SpringBootRestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulWebServiceApplication.class, args);
	}

}
