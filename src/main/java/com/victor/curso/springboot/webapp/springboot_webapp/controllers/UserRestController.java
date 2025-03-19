package com.victor.curso.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/restDetails")
    public Map<String, Object> restDetails(){

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello world");
        body.put("name", "Victor");
        body.put("lastname", "Godinez"); 

        return body;
    }
}
