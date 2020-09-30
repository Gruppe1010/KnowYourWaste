package com.knowyourwaste.demo.models;

import java.io.Serializable;

public class Item implements Serializable
{
    private String name;
    private int wasteNumber;
    
    private static final long serialVersionUID = 1234L;
    
    // constructor
    public Item(String name, int wasteNumber)
    {
        this.name = name;
        this.wasteNumber = wasteNumber;
    }
    
    public Item(String name)
    {
        this.name = name;
        wasteNumber = 0;
    }
    
    // getters + setters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getWasteNumber()
    {
        return wasteNumber;
    }
    public void setWasteNumber(int wasteNumber)
    {
        this.wasteNumber = wasteNumber;
    }
    
   
    
    
    
    
}
