package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/classPath")
public class DemoWebApplication {

    @RequestMapping("/methodPath")
    public String greeting() {
        return "Hello World!111111111111abcdddfff";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
}
