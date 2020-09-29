package com.knowyourwaste.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KnowYourWasteController
{
    @GetMapping("/")
    public String index()
    {
        return "index";
    }
    
    @GetMapping("/opretbruger")
    public String opretBruger()
    {
        return "opretbruger";
    }
    
    
}
