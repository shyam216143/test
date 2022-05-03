package com.shyam.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan({"com.shyam.test","com.temporary"})
@SpringBootApplication
@RestController
public class TestApplication {
    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello(){

        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
