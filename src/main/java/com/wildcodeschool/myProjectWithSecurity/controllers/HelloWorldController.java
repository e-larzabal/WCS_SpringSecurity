package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping({"/","/home"})
    public String welcome_SHIELD(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String welcome_avengers_assemble() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String welcome_secret_bases() {
        return "secret-bases";
    }
}
