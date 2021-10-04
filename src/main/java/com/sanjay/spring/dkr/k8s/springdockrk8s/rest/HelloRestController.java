package com.sanjay.spring.dkr.k8s.springdockrk8s.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloRestController {

	@GetMapping("/{name}")
	public String printTestMessage(@PathVariable("name") String name){
		return "Hello Dear  --- "+name+", have a wonderful day!";
	}
}
