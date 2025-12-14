package com.myproject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //webservices create karnay k liye hota hay
@RequestMapping("/my")
public class teacher {

    // @Autowired
    // student s1;
    // @GetMapping("/hello")
    // public String greetings() {
    //     return s1.hello();
    // }
    @GetMapping("/api1")
    public String api1() {
        return "I am your first api";
    }
     @GetMapping("/api2")
    public String api2() {
        return "I am your second api";
    }
     @GetMapping("/api3")
    public String api3() {
        return "I am your third api";
    }
    
}
