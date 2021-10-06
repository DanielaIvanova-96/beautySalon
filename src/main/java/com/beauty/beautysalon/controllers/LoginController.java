package com.beauty.beautysalon.controllers;

import com.beauty.beautysalon.model.User;
import com.beauty.beautysalon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String doRegistration (@ModelAttribute("user") User user){

        List<User> users = (List<User>) userRepository.findAll();

        for(User test : users){
            if(test.getEmail().equals(user.getEmail()) && test.getPassword().equals(user.getPassword())){
                //System.out.println("Success login");
                return "redirect:homepage";
            }
        }

        return "login";
    }



}
