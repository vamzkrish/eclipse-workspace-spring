package com.jpmc.config.ConfigSer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSerApplication.class, args);
	}
}
