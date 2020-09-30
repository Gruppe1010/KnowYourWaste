package com.knowyourwaste.demo;

import java.io.*;
import java.util.ArrayList;

public class FileManager<T> // <T> fordi den kan tage enhver type
{
    
    
    /**
     * Method used to export an ArrayList to a file
     * @param filename states which file to export to
     * @param arrayList states which list to export
     */
    public void dataWriter(String filename, ArrayList<T> arrayList)
    {
        try
        {
            // TODO: læs op på klasserne FileOutputStream og ObjectOutputStream
            FileOutputStream writeData = new FileOutputStream(filename);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            
            writeStream.writeObject(arrayList);
            writeStream.flush(); // TODO: find ud af hvad flush() gør
            writeStream.close(); // TODO: find ud af hvad close() gør
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    // T i stedet for ArrayList<T> for at gøre at koden kan læse alle types(T)
    // Kan være vi skal bruge det senere til TV Guide
    public ArrayList<T> dataReader(String filename)
    {
        ArrayList<T> importedList = new ArrayList<T>();
        try
        {
            // TODO: læs op på klasserne FileInputStream og ObjectInputStream
            FileInputStream readData = new FileInputStream(filename);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            
            importedList = (ArrayList<T>) readStream.readObject();
            readStream.close();
            // System.out.println(listData.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return importedList;
    }
    

}
