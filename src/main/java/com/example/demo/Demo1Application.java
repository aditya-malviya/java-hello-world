package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Demo1Application {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Greetings from Nuclear Geeks QA";
	}


	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
