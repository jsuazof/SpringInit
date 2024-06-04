package com.example.springinit.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.springinit.models.User;

@Controller
public class UserController {
@GetMapping("/details")
public String details(Model model)
{
    User user = new User("Dayana", "Carvajal");
    
    model.addAttribute("title","Spring Init");
    model.addAttribute("user", user);
    return "details";
}
@GetMapping("/list")

public String list(ModelMap model)
{
    model.addAttribute("title","Listado de usuario");
    return "list";
}
@ModelAttribute("users")
public List<User> userModel()
{
    return Arrays.asList(
                         new User("Dayana", "Carvajal"),
                         new User("Victoria", "Escudero","vescudero@email.cl"),
                         new User("Juan", "Perez","jperez@email.cl"),
                         new User("Pedro", "Gomez","pgomez@email.cl"));
}
}
