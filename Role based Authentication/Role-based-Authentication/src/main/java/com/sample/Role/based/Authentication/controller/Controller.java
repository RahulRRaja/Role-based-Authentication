package com.sample.Role.based.Authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/admin")
    public String admin()
    {
        return "<h4>WELCOME ADMIN</h4>";
    }
    @GetMapping("/user")
    public String user()
    {
        return "<h4>WELCOME USER</h4>";
    }
}
