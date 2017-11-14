package com.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.patient.security.JwtGenerator;



@SpringBootApplication 
public class ClinicalApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClinicalApplication.class, args);
	}

	@Bean
	public JwtGenerator getJwtGenerator (){
		return new JwtGenerator();
	}
}
