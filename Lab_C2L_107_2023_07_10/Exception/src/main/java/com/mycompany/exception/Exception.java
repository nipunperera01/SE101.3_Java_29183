
package com.mycompany.exception;

import java.util.Scanner;
public class Exception 
{

    public static void main(String[] args) 
    {
       int n1,n2,ans;
       Scanner sc=new Scanner(System.in);
       try
       {
           System.out.println("Enter the first number: ");
           n1=sc.nextInt();
           System.out.println("Enter the second number: ");
           n2=sc.nextInt();
           ans=n1/n2;
           System.out.println("Answer is "+ans);
       }
       catch(ArithmeticException e)
       {
           System.out.println("Number zero error");
       }
    }
}
