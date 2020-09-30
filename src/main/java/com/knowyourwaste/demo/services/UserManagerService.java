package com.knowyourwaste.demo.services;

import com.knowyourwaste.demo.models.User;
import com.knowyourwaste.demo.models.WasteList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserManagerService
{
    ArrayList<User> userList = new ArrayList<User>();
    
    public void createAndAddUserToUserList(String username, String email, String password)
    {
        userList.add(new User(username, email, password));
        // TODO: KALD METODE DER OPDATERER EKSPORT
    }
    
    public User checkLogInInfo(String username, String password)
    {
        User nullUser = null;
        for(User user : userList)
        {
            if(user.getUsername().equals(username)) // hvis usernamet-param findes på listen
            {
                if(user.getPassword().equals(password)) // hvis passwordet  på det u-obj matcher password-param
                {
                    return user;
                }
               
            }
        }
        return nullUser;
        
    }
    
    public void createWasteList(ArrayList<String> stringList)
    {
        ArrayList<String> stringListToSet = new ArrayList<>();
        for(String string : stringList)
        {
            if(string!=null)
            {
                stringListToSet.add(string);
            }
        }
    
        for(String string : stringList)
        {
            System.out.println(string);
        }
        
        userList.get(userList.size()-1).setUserWasteListTemplate(stringListToSet);
        
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
