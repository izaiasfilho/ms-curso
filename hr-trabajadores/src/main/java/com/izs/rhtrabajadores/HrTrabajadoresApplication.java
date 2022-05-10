package com.izs.rhtrabajadores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrTrabajadoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrTrabajadoresApplication.class, args);
	}

}
