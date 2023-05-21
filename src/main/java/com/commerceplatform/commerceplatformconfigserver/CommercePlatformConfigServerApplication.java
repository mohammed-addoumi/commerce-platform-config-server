package com.commerceplatform.commerceplatformconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CommercePlatformConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommercePlatformConfigServerApplication.class, args);
	}

}
