package com.online.taxi.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yueyi2019
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class CloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAdminApplication.class, args);
	}

}
