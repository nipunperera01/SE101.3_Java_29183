
package com.mycompany.exception_combined;

import java.util.Scanner;
public class Exception_combined 
{

    public static void main(String[] args) 
    {
       int n1,n2,ans;
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[5];
       try
       {
           System.out.println("Enter the first number: ");
           n1=sc.nextInt();
           System.out.println("Enter the second number: ");
           n2=sc.nextInt();
           ans=n1/n2;
           System.out.println("Answer is "+ans);
           
           arr[5]=22;
           System.out.println("Last element is: "+arr[5]);
       }
       catch(ArithmeticException e)
       {
           System.out.println("Number zero error");
       }
       catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid array index accessed");    
        }
    }
}
