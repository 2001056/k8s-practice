package com.beyond.ordersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderSystemApplication.class, args);
	}
}
