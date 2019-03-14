package com.springboot.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class FeignclientApplication {
	
	@Autowired
    private GreetingClient greetingClient;
 
 
    @RequestMapping("/get-greeting")
    public String greeting() {
        return greetingClient.greeting();
    }
	public static void main(String[] args) {
		SpringApplication.run(FeignclientApplication.class, args);
	}

}

