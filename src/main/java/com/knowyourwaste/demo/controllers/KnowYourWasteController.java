package com.knowyourwaste.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class KnowYourWasteController
{
    @GetMapping("/")
    public String index()
    {
        return "index";
    }
    
    @PostMapping("/logind")
    public String postTwit(WebRequest dataFromTwitForm)
    {
        /* tjek om data fra twitform stemmer overens med Arraylisten userList
        
        checkIfUserExists()
        
        Lav måske noget do-while og så noget try catch inde i den?
        
        return "frontpage"; //
        
         */
        
        return "frontpage";
        
    }
    
    
    
    @GetMapping("/opretbruger")
    public String opretBruger(WebRequest dataFromTwitForm)
    {
        /* Hent data fra form og opret user og kom på userList
        
         */
        
        
        // if successfull == Lav succes-besked
        return "opretbruger";
    }
 
    
}
