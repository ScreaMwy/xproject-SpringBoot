package com.xproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.xproject.*"})
@SpringBootApplication
public class XprojectSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(XprojectSystemApplication.class, args);
	}
}
