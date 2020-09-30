package com.knowyourwaste.demo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class WasteList implements Serializable
{
    private Date creationDate;
    private ArrayList<Item> itemList = new ArrayList<>();
    /*
    public WasteList(ArrayList<Item> itemList) // bruges hver aften
    {
        creationDate = new Date();
      
        this.itemList = itemList;
    }
    
     */
    public WasteList(ArrayList<String> stringList) // bruges til template
    {
        for(String string : stringList)
        {
            itemList.add(new Item(string));
        }
  
    }
    
    
    
    private static final long serialVersionUID = 1234L;
}
