/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstapplication;
import java.util.Scanner;
import java.time.LocalTime;
/**
 *
 * @author sting
 */
public class NestedIf {
     public static void main(String[] args) {
     // Task 1  
     /*
          Scanner scan = new Scanner( System.in);
        
    char letterGrade;
        
     System.out.print( "Enter your grade (0-100) : " );
           int grade = scan.nextInt();
           
          if ( grade >= 90 && grade <= 100 )          
           letterGrade = 'A';
         
          else if ( grade >= 80 && grade <= 89 )
             letterGrade = 'B';   
          
          else if ( grade >= 70 && grade <= 79 )
            letterGrade = 'C';
              
          else if (grade >= 60 && grade <= 69 )
            letterGrade = 'D';
          else //grade fits none of the conditions
    letterGrade = 'F';   
        System.out.println( "Your grade of " + grade
                        + " is a letter grade of " + letterGrade );
         */
         // Task 2
         /*
         Scanner scan = new Scanner( System.in);
         
         System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();
         
        String qualification = "";
        int experience = 0;
         
         if (age >= 18) {
            if (age >= 18 && age <= 25) {
            System.out.print("Enter your qualification (ex, Bachelor's, Master's): ");
                qualification = scan.nextLine();
            } else {
                System.out.print("Enter your years of experience: ");
                experience = scan.nextInt();
            }

            boolean eligible = false;

            if (age >= 18 && age <= 25) {
             if (qualification.equalsIgnoreCase("Bachelor's") || qualification.equalsIgnoreCase("Bachelor")) { 
                    eligible = true;
                }
            } else {
                if (experience >= 2) {
                    eligible = true;
                }
            }

            if (eligible) {
                System.out.println("You are eligible for the job.");
            } else {
                System.out.println("You are not eligible for the job.");
            }
        } else {
        System.out.println("You are not eligible for the job (age requirement not met).");
        }

       
    }
         */
         
         
         // Task 3
         /*
         Scanner scan = new Scanner( System.in);
         
         System.out.print("Enter your salary: $");
        double salary = scan.nextDouble();

        boolean loanApproved = false; // Initialize to denied

        if (salary >= 50000) {
            loanApproved = true;
        } else if (salary >= 30000 && salary <= 49999) {
            System.out.print("Enter your credit score: ");
            int creditScore = scan.nextInt();
            if (creditScore >= 700) {
                loanApproved = true;
            }
        }

        if (loanApproved) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Denied");
        }
         */
         //Task 4
         /*
            Scanner scan = new Scanner(System.in);

        System.out.print("Enter the traffic light color (red, yellow, green): ");
        String lightColor = scan.nextLine().toLowerCase();

        if (lightColor.equals("red")) {
            System.out.println("STOP");
        } else if (lightColor.equals("yellow")) {
            System.out.println("READY");
        } else if (lightColor.equals("green")) {
            LocalTime now = LocalTime.now();
            LocalTime morningStart = LocalTime.of(6, 0); // 6:00 AM
            LocalTime morningEnd = LocalTime.of(12, 0); // 12:00 PM

            if (now.isAfter(morningStart) && now.isBefore(morningEnd)) {
                System.out.println("GO SLOW");
            } else {
                System.out.println("GO");
            }
        } else {
            System.out.println("Invalid input.");
        }
*/
       
    }


