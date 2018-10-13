package com.linshen.grpcspringcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GrpcSpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcSpringCloudConsumerApplication.class, args);
    }
}
