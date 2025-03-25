package com.victor.curso.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.curso.springboot.webapp.springboot_webapp.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> restDetails(){

        User user = new User("Victor", "Godinez");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello world");
        body.put("User", user);
        //body.put("Name", user.getName());

        return body;
    }
}
