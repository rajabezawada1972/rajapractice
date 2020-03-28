package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/api")
public class HelloWorldController {
	@GetMapping(value="/getData")
	public String getData() {
		return "hello world controller";
	}

}
