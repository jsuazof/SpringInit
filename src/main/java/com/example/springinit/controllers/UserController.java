package com.example.springinit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springinit.models.User;

@Controller
public class UserController {

@GetMapping("/details")
public String details(Model model)
{
    User user = new User("Dayana", "Carvajal","dayana.carvajal@email.com");
    
    model.addAttribute("title","Spring Init");
    model.addAttribute("user", user);
    return "details";
}

}
