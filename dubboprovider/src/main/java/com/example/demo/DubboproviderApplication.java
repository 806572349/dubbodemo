package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:providers.xml")
public class DubboproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboproviderApplication.class, args);
	}
}
