package com.yili.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

	@RequestMapping("/home")
	@ResponseBody
	public String home(){
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestController.class, args);
	}
}
