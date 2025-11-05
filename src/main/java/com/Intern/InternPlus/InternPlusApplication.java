package com.Intern.InternPlus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class InternPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternPlusApplication.class, args);
	}

}
