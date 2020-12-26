package com.example.testproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	@GetMapping("/ping")
	public String getData() {
		return "KL";
	}
	@GetMapping("/ping2")
	public String dd() {
		return "kl";
	}

}
