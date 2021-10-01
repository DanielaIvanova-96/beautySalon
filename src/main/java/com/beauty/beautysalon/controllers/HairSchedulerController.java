package com.beauty.beautysalon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HairSchedulerController {

    @RequestMapping("/hair")
    public String hairScheduler(){
        return "hair";
    }
}
