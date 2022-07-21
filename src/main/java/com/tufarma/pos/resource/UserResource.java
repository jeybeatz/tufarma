package com.tufarma.pos.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This is the user controller in a MVC project
@RestController
@RequestMapping(value = "/user")
public class UserResource {
    @GetMapping("/home")
    public String showUser(){

        return "application Works";
    }

}
