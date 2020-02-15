package com.muhardin.endy.belajar.belajarspringdataenvers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "entityModifierAuditorAware")
public class BelajarSpringdataEnversApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringdataEnversApplication.class, args);
	}

}
