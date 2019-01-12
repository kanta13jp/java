package com.dev2qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("main!");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}

