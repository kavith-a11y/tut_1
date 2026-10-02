package com.example.tut_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/sample")
    public String sample(){
        return "This is a sample page";
    }
}
