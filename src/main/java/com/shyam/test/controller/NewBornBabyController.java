package com.shyam.test.controller;

import com.temporary.ComponentScanTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewBornBabyController {
    @Value("${baby.weight:No Baby Weight property}")
    String babyWeight;

    @Autowired
    NewBornBabyService newBornBabyService;
   @GetMapping("baby/name")
    public String getBabyName(){

       return "he baby name is"+newBornBabyService.getBabyName() +
               "The baby Weight is "+babyWeight;

   }


}
