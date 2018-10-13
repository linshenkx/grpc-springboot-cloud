package com.linshen.grpceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GrpcEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcEurekaServerApplication.class, args);
    }
}
