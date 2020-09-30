package com.knowyourwaste.demo.models;

import com.knowyourwaste.demo.FileManager;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable
{
    private String username;
    private String email;
    private String password;
    private WasteList userWastListTemplate;
    private ArrayList<WasteList> wasteListArray;
    
    private static final long serialVersionUID = 1234L;
    
    // Constructor
    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        wasteListArray = new ArrayList<>();
    }
    
    // Getters + setters
    public WasteList getUserWastListTemplate()
    {
        return userWastListTemplate;
    }
    public void setUserWastListTemplate(WasteList userWastListTemplate)
    {
        this.userWastListTemplate = userWastListTemplate;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public ArrayList<WasteList> getWasteListArray()
    {
        return wasteListArray;
    }
    public void setWasteListArray(ArrayList<WasteList> wasteListArray)
    {
        this.wasteListArray = wasteListArray;
    }
    
    
    // Andre metoder
    
    /*metode vi kan kalde i vores andre metoder som sørger for at opdatere vores fil
    public void updateUserListExport(ArrayList<User> userList)
    {
        FileManager<User> fileManager = new FileManager<User>();
        fileManager.dataWriter("userlistfile", userList);
    }
    
     */
    
    
    
    
    
    
}
