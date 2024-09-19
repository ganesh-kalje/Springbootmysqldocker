package com.Springbootmysqldocker.Springbootmysqldocker;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringbootmysqldockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmysqldockerApplication.class, args);
	}
	
	@GetMapping("/hello-world")
	public String getAllStudent() {
		return "ganesh";
	}

}
