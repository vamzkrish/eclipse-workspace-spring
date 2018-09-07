package com.swag.SwagDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class SwagDemoApp {

	public static void main(String[] args) {
		SpringApplication.run(SwagDemoApp.class, args);
	}
}
