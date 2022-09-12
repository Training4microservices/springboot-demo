package com.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController{
    @GetMapping(value="/name")
    public String getName(){return "MegaLakshmi";}
    @GetMapping(value="/")
    public String getData(){return "Springboot is a string";}
}
