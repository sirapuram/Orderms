package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
public class OrdermsCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdermsCircuitBreakerApplication.class, args);//
	}
}
