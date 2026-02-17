/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;
import java.util.Scanner;
/**
 *
 * @author sting
 */
public class Week7 {
    public static void main(String[] args) {
        //Task1
       /*
        Scanner scan = new Scanner ( System.in );
         
        System.out.print( " Enter a number " );
        int number = scan.nextInt();
         
          if (number % 2 ==0 )
       
        System.out.println(number + " is even." );
        else
        System.out.println(number + " is odd.");
          if (number ==0)
      System.out.println(number + " is zero.");
        */
        
        //Task2
     /*  
        int largest;
        int num1, num2, num3;
        
        Scanner scan = new Scanner ( System.in );
        
        System.out.print( " Enter the first integer: " );
        num1 = scan.nextInt();        
        System.out.print( " Enter the second integer: " );
        num2 = scan.nextInt();
        System.out.print( " Enter the third integer: " );
        num3 = scan.nextInt();
        
        if (num1 > num2 )
        largest = num1;
        else
        largest = num2;
        if ( num3 > largest)
        largest = num3;
    System.out.println(largest + " Is the largest number"); 
       */  
        
       //Task3 ATM if-else-if
      /*
      Scanner scan = new Scanner ( System.in ); 
       System.out.print(" Enter Balance: ");
        int balance = scan.nextInt();
       System.out.print(" Enter Withdrawal Amount: ");
       int withdrawal = scan.nextInt();
       
       if (balance >= withdrawal)
       System.out.println(" Withdrawal Successful!");
       
       else if (balance <= withdrawal)
       System.out.println(" Insufficient Funds. ");
       */
       
       
       
       
       
       //Task4 Traffic light system
    /*   
       Scanner scan = new Scanner( System.in);
       System.out.print( "Enter color (green,red,yellow): " );
       String color = scan.nextLine().toLowerCase();   
       
       if (color.equals("red"))
       System.out.println(" STOP ");
       else if (color.equals("yellow"))
       System.out.println(" Ready to Go ");
       else if (color.equals("green"))
       System.out.println(" GO ");
       else
       System.out.println("Invalid Input");
*/ 
       //Task5 E-commerce discount
       /*
       Scanner scan = new Scanner ( System.in );
               
       System.out.print( "Enter your total: $ " );
       double purchaseAmount = scan.nextDouble();
       
       double discountPercentage = 0;
       
      if (purchaseAmount > 1000) 
       discountPercentage = 20;
      else if (purchaseAmount >= 500 && purchaseAmount <= 1000)
       discountPercentage = 10;
       
       double discountAmount = (discountPercentage / 100) * purchaseAmount;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Discount: $" + discountAmount);
        System.out.println("Final Amount: $" + finalAmount);
       */
       
       
       
       
    }
}
