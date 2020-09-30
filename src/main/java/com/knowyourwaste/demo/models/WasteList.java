package com.knowyourwaste.demo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class WasteList implements Serializable
{
    private Date creationDate;
    private ArrayList<Item> itemList;
    
    
    private static final long serialVersionUID = 1234L;
}
