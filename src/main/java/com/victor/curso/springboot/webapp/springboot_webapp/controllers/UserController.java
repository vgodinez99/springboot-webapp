package com.victor.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.victor.curso.springboot.webapp.springboot_webapp.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Victor", "Godinez");

        model.addAttribute("title", "Hello world");
        model.addAttribute("user", user);
        
        /* 
        model.addAttribute("name", "Victor");
        model.addAttribute("lastname", "Godinez");
        */

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
