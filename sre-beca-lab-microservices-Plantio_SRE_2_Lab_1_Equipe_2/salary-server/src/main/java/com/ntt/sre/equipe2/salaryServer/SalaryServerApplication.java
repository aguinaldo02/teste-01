package com.ntt.sre.equipe2.salaryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SalaryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalaryServerApplication.class, args);
	}
}
