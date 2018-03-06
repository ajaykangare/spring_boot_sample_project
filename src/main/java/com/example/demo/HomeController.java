package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String home() {
		return "......World......";
	}

	@RequestMapping("/hello")
	public @ResponseBody String hello_home() {
		return "Hello World";
	}
	
	@RequestMapping("/bye")
	public @ResponseBody String bye_home() {
		return "bye World";
	}
}
