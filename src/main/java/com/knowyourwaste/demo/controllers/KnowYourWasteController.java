package com.knowyourwaste.demo.controllers;

import com.knowyourwaste.demo.services.UserManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Controller
public class KnowYourWasteController
{
    UserManagerService userManagerService = new UserManagerService(); //

    @GetMapping("/")
    public String index()
    {
        return "index";
    }
    
    @PostMapping("/postLogIn") // form-action
    public String postLogIn(WebRequest dataFromLogInForm)
    {
        /* tjek om data fra twitform stemmer overens med Arraylisten userList
        
        checkIfUserExists()
        
        Lav måske noget do-while og så noget try catch inde i den?
        
        return "frontpage"; //
        
         */
    
        boolean islogInInfoValid = userManagerService.checkLogInInfo(dataFromLogInForm.getParameter("usernameinput"),
                dataFromLogInForm.getParameter("passwordinput"));
        
        if(islogInInfoValid == true)
        {
            return "redirect:/frontPage"; // HTML
        }
        
        // else - den er false
        return "redirect:/";
    }
    @GetMapping("/frontPage") // URL
    public String frontPage()
    {
        return "frontpage"; // HTML
    }
    
    @GetMapping("/createUser") // URL
    public String createUser()
    {
        return "createuser";// HTML
    }
    
    @PostMapping("/postCreateUser") // form-action
    public String postCreateUser(WebRequest dataFromCreateUserForm)
    {
    
        userManagerService.createAndAddUserToUserList(dataFromCreateUserForm.getParameter("usernameinput"),
                dataFromCreateUserForm.getParameter("emailinput"),
                dataFromCreateUserForm.getParameter("passwordinput"));
        
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
        
        return "redirect:/createWasteList";
    }
    
    @GetMapping("/createWasteList") // URL
    public String createWasteList()
    {
        return "createwastelist"; // HTML
    }
    
    @PostMapping("/postCreateWasteList") // form-action
    public String postCreateWasteList(WebRequest dataCreateWasteListForm)
    {
    
        dataCreateWasteListForm.getParameter("passwordinput")
        
        
        ArrayList<String> stringList = new ArrayList<>();
        
        if()
        {
            stringList.add();
        }
        stringList.add();
    
        userManagerService.createWasteList(stringList);
    
        dataCreateWasteListForm.getParameter("ryebread"); // ryebread == name
        dataCreateWasteListForm.getParameter("bread"); // ryebread == name
        
        return "redirect:/frontpage"; // HTML
    }
    
    
    
    
}
