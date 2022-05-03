package com.temporary;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanTest {
    public void hello(){
        System.out.println("hello World");
    }
}
