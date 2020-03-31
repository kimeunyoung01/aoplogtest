package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AoplogtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AoplogtestApplication.class, args);
	}

}
