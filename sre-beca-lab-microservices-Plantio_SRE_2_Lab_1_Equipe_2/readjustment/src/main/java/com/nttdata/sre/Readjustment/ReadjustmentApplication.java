package com.nttdata.sre.Readjustment;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.nttdata.sre.Readjustment.util.SpringBootUtil;

@EnableEurekaClient
@SpringBootApplication
public class ReadjustmentApplication {
	private static final Logger logger = LoggerFactory.getLogger(ReadjustmentApplication.class);

	public static void main(String[] args) {
		SpringBootUtil.setRandomPort(8100, 8199);
		ApplicationContext ctx = SpringApplication.run(ReadjustmentApplication.class, args);
		logger.info("Application " + ctx.getApplicationName() + " started");

	}

}
