package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*@EnableJpaRepositories(basePackages="com.test.app")*/
@SpringBootApplication(scanBasePackages="com")
public class StatesApp {
	public static void main(String[] args) {
		SpringApplication.run(StatesApp.class, args);
	}

}
