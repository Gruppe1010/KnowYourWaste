package com.knowyourwaste.demo.controllers;

import com.knowyourwaste.demo.UserManager;
import com.knowyourwaste.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@Controller
public class KnowYourWasteController
{
    UserManager userManager = new UserManager();
    
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
    
    @GetMapping("/opretBruger") // URL
    public String opretBruger()
    {
        return "/opretbruger";// HTML
    }
    
    @PostMapping("/postOpretBruger")
    public String postOpretBruger(WebRequest dataFromOpretBrugerForm)
    {
        /*
        String password = dataFromOpretBrugerForm.getParameter("adgangskodeinput");
        String bekræftPassword = dataFromOpretBrugerForm.getParameter("bekræftadgangskodeinput");
        
        if(password.equals(bekræftPassword))//password og bekræftpassword ikke matcher)
        {
            userManager.addUserToUserList(new User(dataFromOpretBrugerForm.getParameter("usernameinput"),
                    dataFromOpretBrugerForm.getParameter("emailinput"), password));
    
            
            return "redirect:/opretLukkeliste";
        }
       
       
    
        return "/opretBruger"; // muligvis: "redirect:/opretBruger" - returner samme side + print besked om password
        // ikke matcher
        
         */ // Funktion til at den tjekker om password og bekræftpassword er ens
    
        userManager.addUserToUserList(new User(dataFromOpretBrugerForm.getParameter("usernameinput"),
                dataFromOpretBrugerForm.getParameter("emailinput"),
                dataFromOpretBrugerForm.getParameter("adgangskodeinput")));
    
        return "redirect:/opretLukkeliste";
    }
    
    @GetMapping("/opretLukkeliste") // URL
    public String opretLukkeliste()
    {
        return "opretlukkeliste"; // HTML
    }
    
    
    
    
}
