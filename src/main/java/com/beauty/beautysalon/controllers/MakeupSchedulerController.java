package com.beauty.beautysalon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MakeupSchedulerController {

    @RequestMapping("/makeup")
    public String makeupScheduler(){
        return "makeup";
    }
}
