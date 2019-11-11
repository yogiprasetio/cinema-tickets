/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinematickets.controller;

import com.cinematickets.entity.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author udin
 */
@Controller
public class UserController {
    
    @GetMapping("/users")
    public String getUsers(){
        return "users";
    }
    
    @PostMapping("/add-user")
    public String addUser(@Valid User user,BindingResult result, Model model){
        if(result.hasErrors()){
            return "add-user";
        }
       
        model.addAttribute("users", model);
        return "users";
    }
    
    @PostMapping("/update-user/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid User user,BindingResult result, Model model){
        if(result.hasErrors()){
            return "update-user";
        }
       
        model.addAttribute("users", model);
        return "users";
    }
    
}
