package com.flouis.gradledemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/")
	public String indexInfo(){
		return "Welcome visit Gradle Demo~";
	}

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return "hello " + name;
	}

}
