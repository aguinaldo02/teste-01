package com.ntt.sre.equipe2.apigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.ntt.sre.equipe2.apigateway.util.SpringBootUtil;

@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayApplication {
	private static final Logger logger = LoggerFactory.getLogger(ApiGatewayApplication.class);

	
	public static void main(String[] args) {
		SpringBootUtil.setRandomPort(8700, 8799); 
		ApplicationContext ctx = SpringApplication.run(ApiGatewayApplication.class, args);
		logger.info("Application " + ctx.getApplicationName() + " started");
		}

}
