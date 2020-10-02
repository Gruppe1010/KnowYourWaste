package com.knowyourwaste.demo.controllers;

import com.knowyourwaste.demo.models.User;
import com.knowyourwaste.demo.services.UserManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;

@Controller
public class    KnowYourWasteController
{
    UserManagerService userManagerService = new UserManagerService(); //
    User loggedInUser = null;

    @GetMapping("/")
    public String index()
    {
        loggedInUser = null; //Så den nulstiller ved log ud
        return "index";
    }
    
    @PostMapping("/postLogIn") // form-action
    public String postLogIn(WebRequest dataFromLogInForm)
    {
        User user = userManagerService.checkLogInInfo(dataFromLogInForm.getParameter("usernameinput"),
                dataFromLogInForm.getParameter("passwordinput"));
        
        if(user!=null)
        {
            loggedInUser = user;
            return "redirect:/createWasteList"; // URL
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
        
         */ // SLET IKKE - Funktion til at den tjekker om password og bekræftpassword er ens
        
        return "redirect:/createWasteListTemplate"; //URL
    }
    
    @GetMapping("/createWasteListTemplate") // URL
    public String createWasteListTemplate()
    {
        return "createwastelisttemplate"; // HTML
    }
    
    @PostMapping("/postCreateWasteListTemplate") // form-action
    public String postCreateWasteList(WebRequest dataCreateWasteListForm)
    {
        ArrayList<String> stringList = new ArrayList<>();
        
        stringList.add(dataCreateWasteListForm.getParameter("bread"));
        stringList.add(dataCreateWasteListForm.getParameter("ryebread"));
        stringList.add(dataCreateWasteListForm.getParameter("spandauer"));
        stringList.add(dataCreateWasteListForm.getParameter("cake"));
        stringList.add(dataCreateWasteListForm.getParameter("othellocake"));
        stringList.add(dataCreateWasteListForm.getParameter("rumcake"));
        
        userManagerService.createWasteList(stringList);
        
        return "redirect:/frontPage"; // URL
    }
    
    @GetMapping("/createWasteList") // URL
    public String createWasteList()
    {
        return "createwastelist"; // HTML
    }
    
    @GetMapping("/statistics") // URL
    public String statistics()
    {
        return "statistics"; // HTML
    }

    @GetMapping("/wasteListConfirmation") // URL
    public String wasteListConfirmation()
    {
        return "wastelistconfirmation";// HTML
    }
    
    
}
