package com.springboot.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String home(){
        return  "<h1> Welecome </h1>";
    }
    @GetMapping("/user")
    public String user(){
        return  "<h1> User </h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return  "<h1> Admin </h1>";
    }

    @GetMapping("/name")
    public String name(){
        return  "<h1> Amine </h1>";
    }

}
