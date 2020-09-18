package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping({"/","/home"})
    @ResponseBody
    public String welcome_SHIELD(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String welcome_avengers_assemble(Model model) {
        model.addAttribute("campus", "campus");
        return "campus";
    }

    @GetMapping("/secret-bases")
    @ResponseBody
    public String welcome_secret_bases() {
        return "secret-bases";
    }
}
