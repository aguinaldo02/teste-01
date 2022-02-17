package com.ntt.sre.equipe2.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route("readjustment", rd -> rd.path("/officer/**")
                        .uri("http://localhost:8761/eureka/"))
                .route("salaryIncrease", sl -> sl.path("/increases/**")
                        .uri("http://localhost:8761/eureka/"))
                .build();

    }

}
