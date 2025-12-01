package com.custard.curemap_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CuremapConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuremapConfigserverApplication.class, args);
	}

}
