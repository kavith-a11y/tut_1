package com.example.tut_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/home")
    public String home() {
        return "Hello from the backend!";
    }
    @GetMapping("/info")
    public String info(){
        return "version 3.1.1";
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "Goodbye";
    }

}
