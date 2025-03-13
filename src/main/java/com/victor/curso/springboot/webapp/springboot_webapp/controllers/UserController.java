package com.victor.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        model.addAttribute("title", "Hello world");
        model.addAttribute("name", "Victor");
        model.addAttribute("lastname", "Godinez");

        return "details";
    }
    //Same proccess but with map
    /*@GetMapping("/details")
    public String details(Map<String, Object> model){

        model.put("title", "Hello world");
        model.put("name", "Victor");
        model.put("lastname", "Godinez");

        return "details";
    }*/
}
