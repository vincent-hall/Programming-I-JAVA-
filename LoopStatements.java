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
public class LoopStatements {
    public static void main(String[] args) {
        //Task 1 Print number 1-10
     /*
        for (int a=1; a<11; a++ ) {   
        System.out.println("Number : " + a);
    }
     */   
    //Task 2 Sum of first N natural numbers    
    /* 
    
     System.out.println("Enter input: ");   
        Scanner sc = new Scanner(System.in);   
        int days = sc.nextInt();
   
    int sum = 0;    
     for (int a = 1; a <=days; a++) {  
        sum = sum+a;
          
     }
 System.out.println("Your total is: " + sum );
  */
   //Task 3 Factorial of a number 
 /*
   System.out.println("Enter input: ");
Scanner sc = new Scanner(System.in);    
int n = sc.nextInt();

    int factorial = 1;  
  for ( int a = 1; a <= n; a++) { 
    factorial *= a;
  }
 System.out.println("The factorial is " + factorial);   
 */ 
 
 //Task 4 Print multiplication table
 /*
   System.out.println("Enter input: ");
Scanner sc = new Scanner(System.in);    
int n = sc.nextInt();
    
 System.out.println("Multiplication table for " + n );
    
   for ( int a = 1; a <= 10; a++ ){ 
    System.out.println(n + " x " + i + " = " + (n * 1));
   }
   */
//Task 5  Count even and odd numbers
/*
    System.out.println("Enter a Number: ");
Scanner sc = new Scanner(System.in);    
int n = sc.nextInt();

 int evenCount = 0;   
 int oddCount = 0;   
    
    for ( int a = 1; a<= n; a++){
        if ( a % 2 == 0){
               evenCount++;
        } else { 
           oddCount++;
        }
    }
    System.out.println("Even Numbers: " + evenCount);
    System.out.println("Odd Numbers: " + oddCount);
   */
//Task 6 Fibonacci Sequence
/*
System.out.println("Enter a Number: ");
Scanner sc = new Scanner(System.in);    
int n = sc.nextInt();
    
 int a = 0 ;
 int b = 1 ; 
 
 System.out.print("Fibonnaci sequence up to " + n + " terms: ");
 
if ( n >= 1 ){
    System.out.print( a +" , ");
}
if ( n >= 2 ){
    System.out.print( b );
}
    for ( int i = 3; i <= n; i++ ){
int c = a + b;

System.out.print(" , " + c );
a = b;
b = c;
    }
*/


    
//Task 7 Prime numbers between 1 and N
 /* 
      System.out.println("Enter a Number: ");
Scanner sc = new Scanner(System.in);    
int n = sc.nextInt();

if (n < 2) {
    System.out.println("No prime numbers in the given range");
}
System.out.println("Prime numbers between 1 and " + n + ": ");

for (int a = 2; a <= n; a++){
boolean isPrime = true;

for (int b = 2; b < a; b++){
if (a % b == 0){
 isPrime = false;
     }
}
if (isPrime){
System.out.print(a + " ");
}
}
*/
 //Task 8 Sum of digits of a number 
 /*
 System.out.print("Enter a positive integer: ");
 Scanner sc = new Scanner(System.in);    
int n = sc.nextInt();
 
 if ( n >= 0){
  
  } else { 
 System.out.println("Invalid input. Please enter a positive integer");
sc.nextInt();

 int sum = 0;
 int temp = n;
while (temp > 0) {
 int digit = temp % 10;
     sum += digit;
 temp /= 10;
       }
  
System.out.println("The sum of the digits of " + n + " is: " + sum);
      }        
    }
*/
 }
}


 
 
 
 
 
 
  