package com.patient.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.model.JwtUser;
import com.patient.security.JwtGenerator;



@RestController
@RequestMapping("clinicalapplication/token")
@Component
public class TokenController {


	private JwtGenerator jwtGenerator;


	public TokenController(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}

	@PostMapping
	public String generate(@RequestBody final JwtUser jwtUser) {

		return jwtGenerator.generate(jwtUser);

	}
}
