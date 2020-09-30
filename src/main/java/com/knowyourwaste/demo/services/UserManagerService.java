package com.knowyourwaste.demo.services;

import com.knowyourwaste.demo.models.User;
import com.knowyourwaste.demo.models.WasteList;

import java.util.ArrayList;

public class UserManagerService
{
    ArrayList<User> userList = new ArrayList<User>();
    
    public void createAndAddUserToUserList(String username, String email, String password)
    {
        userList.add(new User(username, email, password));
        // TODO: KALD METODE DER OPDATERER EKSPORT
    }
    
    public boolean checkLogInInfo(String username, String password)
    {
        for(User user : userList)
        {
            if(user.getUsername().equals(username)) // hvis usernamet-param findes på listen
            {
                if(user.getPassword().equals(password)) // hvis passwordet  på det u-obj matcher password-param
                {
                    return true;
                }
               
            }
        }
        return false;
        
    }
    
    public void createWasteList(ArrayList<String> stringList)
    {
    
        userList.get(userList.size()-1).setUserWasteListTemplate(stringList);
        
        //userList.get(userList.size()-1).setUserWasteListTemplate(new WasteList(stringList));
    }
    
    
    
    
    // UserManager userManager = new UserManager();
    /*
    public void createAndAddUserToUserList(String username, String email, String password)
    {
        userManager.addUserToUserList(new User(username, email, password));
        
    }
    
    public boolean checkLogInInfo(String username, String password)
    {
        userManager.check
    
    }
    
    
     */
    
    
}
