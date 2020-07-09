package com.manasi.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ByeController {
    @ResponseBody
    @RequestMapping("/bye")
    public String saybye()
    {
        return "Bye Everyone";
    }
}
