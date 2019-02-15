package com.hello.microservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.microservice.pojo.Hello;

@RestController
public class HelloControler {

	
	@RequestMapping("hello/{firstname}/{lastname}")
	public Hello sayHello(@PathVariable("firstname") String firstName, @PathVariable("lastname") String lastName) {
		Hello hello = new Hello(firstName, lastName);
		
		return hello;
	}
}
