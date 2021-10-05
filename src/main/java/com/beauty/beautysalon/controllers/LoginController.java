package com.beauty.beautysalon.controllers;

import com.beauty.beautysalon.model.User;
import com.beauty.beautysalon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /*@RequestMapping(value="/login", method = RequestMethod.POST)
    public String doRegistration (Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "login";
    }*/

    /*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String submitForm (Model model){
        User user = new User(model.getAttribute("user"));
        String username = user.getEmail();
        String password = user.getPassword();




        return "redirect:homepage";
    }*/


}
