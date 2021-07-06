package com.nt.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello() {
		System.out.println("HelloWorldController.hello()");
		return "Hello World Spring Boot";
	}
}
