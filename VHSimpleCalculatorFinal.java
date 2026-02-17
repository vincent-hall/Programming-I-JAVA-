/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author sting
 */
public class VHSimpleCalculatorFinal {
    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
        char operation;
        String continueCalc = null;

        System.out.println("Welcome to the Simple Calculator!");

        do {
            System.out.print("Enter an operator (+, -, *, /): ");
            operation = sc.next().charAt(0);

            System.out.print("How many numbers do you want to " + operation + "? ");
            int count = sc.nextInt();

            if (count < 2) {
                System.out.println("You need at least two numbers.");
                continue;
            }

            double[] numbers = new double[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + " > ");
                numbers[i] = sc.nextDouble();
            }

            double result = numbers[0];
            boolean validOperation = true;

            for (int i = 1; i < count; i++) {
                switch (operation) {
                    case '+':
                        result = Math.addExact((int) result, (int) numbers[i]); 
                        break;
                    case '-':
                        result = Math.subtractExact((int) result, (int) numbers[i]); 
                        break;
                    case '*':
                        result = Math.multiplyExact((int) result, (int) numbers[i]); 
                        break;
                    case '/':
                        if (numbers[i] == 0) {
                            System.out.println("Cannot divide by zero.");
                            validOperation = false;
                        } else {
                            result = result / numbers[i]; 
                        }
                        break;
                    default:
                        System.out.println("Invalid operator. Please enter +, -, *, or /.");
                        validOperation = false;
                        break;
                }

                if (!validOperation) break;
            }

            if (validOperation) {
                System.out.print("Result: ");
                for (int i = 0; i < count; i++) {
                    System.out.print(numbers[i]);
                    if (i < count - 1) System.out.print(" " + operation + " ");
                }
                System.out.println(" = " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalc = sc.next();

        } while (continueCalc.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}

       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    