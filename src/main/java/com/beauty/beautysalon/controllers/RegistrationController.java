package com.beauty.beautysalon.controllers;

import com.beauty.beautysalon.model.User;
import com.beauty.beautysalon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/registerForm")
    public String registration(){
        return "registerForm";
    }

    @RequestMapping(value = "/registerForm", method = RequestMethod.POST)
    public String registrationForm(@ModelAttribute("newUser") User user){
        userRepository.save(user);
        return "redirect:homepage";
    }
}
