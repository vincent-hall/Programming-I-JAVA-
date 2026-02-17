/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author sting
 */
public class LoopAssignment {
     public static void main(String[] args){
         //Task 1 Count even and odd numbers
         /*
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for (int a = 1; a <= n; a++) {
            if (a % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
*/
       //Task 2 Find the factorial of a number  
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for its factorial: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }
*/
       
       //Task 3 
     /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();

        int reversedNumber = 0;
        int temp = number; 

        do {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit; 
            temp /= 10; 
        } while (temp != 0);

        System.out.println("Reversed number: " + reversedNumber);
     */
       //Task 4
       /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = sc.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i; // Add the current number to the sum
        }

        System.out.println("Sum of numbers from " + start + " to " + end + " is: "
                + sum);
       */
       //Task 5
       /*
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
       */
       //Task 6
      /* 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a perfect number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
*/
       
       //Task 7
      /*
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("No divisors other than 1 and itself for numbers <= 1.");
        } else {
            int largestDivisor = 1;

            int i = number / 2; 

            while (i >= 1) {
                if (number % i == 0) {
                    largestDivisor = i;
                    break; 
                }
                i--;
            }

            System.out.println("Largest divisor of " + number + " is: " + largestDivisor);
        }
        */
       
       //Task 8
       /*
         Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);
*/
        
        
        
        
        
        
        
        
        
        
        
     }
}
