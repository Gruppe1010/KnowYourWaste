package com.knowyourwaste.demo;

import com.knowyourwaste.demo.models.User;

import java.util.ArrayList;

public class UserManager
{
    ArrayList<User> userList = new ArrayList<User>();
    
    public void addUserToUserList(User newUser)
    {
        userList.add(newUser);
        // KALD METODE DER OPDATERER EKSPORT
    }
    
}
