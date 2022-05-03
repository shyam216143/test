package com.shyam.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shyam")
public class HelloController {
   @GetMapping
    public String getUser(){

       return "HTTP GET request was sent";
    }
    @PostMapping
    public String createUser(){
       return "Http POST request was sent";
    }
    @DeleteMapping
    public String deleteUser(){
        return "Http DELETE request was sent";
    }
    @PutMapping
    public String updateUser(){
        return "Http PUT request was sent";
    }
}
