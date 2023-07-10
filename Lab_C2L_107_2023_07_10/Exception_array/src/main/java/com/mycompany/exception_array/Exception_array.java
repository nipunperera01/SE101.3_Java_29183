
package com.mycompany.exception_array;

public class Exception_array 
{

    public static void main(String[] args) 
    {
        int arr[]=new int[5];
        
        try
        {
            arr[6]=22;
            System.out.println("Last element is: "+arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index accessed");    
        }
    }
}
