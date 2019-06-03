package com.amilaa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET )
    @ResponseBody
    public String home(){




        return "Hello Spring MVC.....!!!";


    }





}
