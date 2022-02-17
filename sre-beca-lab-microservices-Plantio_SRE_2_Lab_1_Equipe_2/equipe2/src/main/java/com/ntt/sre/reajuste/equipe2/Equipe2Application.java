package com.ntt.sre.reajuste.equipe2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import com.ntt.sre.reajuste.equipe2.util.SpringBootUtil;


@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Equipe2Application {
	private static final Logger logger = LoggerFactory.getLogger(Equipe2Application.class);

	public static void main(String[] args) {
		SpringBootUtil.setRandomPort(8200, 8299);   
		ApplicationContext ctx = SpringApplication.run(Equipe2Application.class, args);
		logger.info("Application " + ctx.getApplicationName() + " started");
		
		
	}
}
