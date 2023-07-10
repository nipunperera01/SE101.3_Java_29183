
package com.mycompany.exce_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exce_03 
{

    public static void main(String[] args) 
    {
        try
        {
            File f=new File("nonexistent.txt");
            Scanner sc=new Scanner(f);
            
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error:File not found \n"+e);
        }
        
    }
}
