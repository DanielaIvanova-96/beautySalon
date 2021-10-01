package com.beauty.beautysalon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NailsSchedulerController {
    @RequestMapping("/nails")
    public String nailsScheduler(){
        return "nails";
    }
}
