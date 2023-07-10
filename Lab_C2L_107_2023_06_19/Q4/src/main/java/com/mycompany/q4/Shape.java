
package com.mycompany.q4;

public class Shape 
{
    abstract double calculateArea();
    
    void display()
    {
        System.out.println("Area:"+calculateArea());
    }
}
