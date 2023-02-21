package com.jb.yaniv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YanivApplication {

	public static void main(String[] args) {
		SpringApplication.run(YanivApplication.class, args);
	}

	@GetMapping("yaniv")
	public String helloYaniv(){
		return "Hello from Yaniv!";
	}

}
