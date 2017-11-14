package com.patient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clinicalapplication/login")
public class LoginController {

	@GetMapping
	public String login() {
		return "You are Logged In";
	}
}
