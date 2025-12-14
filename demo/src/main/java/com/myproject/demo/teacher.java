package com.myproject.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class teacher {

    @Autowired
    student s1;
    @GetMapping("/hello")
    public String greetings() {
        return s1.hello();
    }
    
}
