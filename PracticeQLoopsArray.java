/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author sting
 */
public class PracticeQLoopsArray {
    public static void main(String[] args){
     
        //Task 1 ATM Log In System
      /*
        int pin  = 1234;
        int attempt = 0;
        int maxAttempt = 3;
        
        
 Scanner sc = new Scanner(System.in); 
       
        while (attempt < maxAttempt){
       System.out.print("Welcome to ATM! Please Enter Your PIN ");
        
        int userPin = sc.nextInt();
                      attempt++;
        if ( userPin == pin){
        System.out.println("Access Granted");
            break;
        } else {   
      System.out.println("Incorrect PIN entered. You have " + (maxAttempt - attempt) +      
            " attempts remaining.");
        }
        }
      */ 
        //Task 2 Password validation with do-while
      /*
        Scanner sc = new Scanner(System.in);
        String password;
        boolean isValid;
        
        do {
        System.out.print("Enter your password (at least 8 characters" +
                    " and must contain a digit: ");
        password = sc.nextLine();
        isValid = password.length() >= 8 && password.matches(".*\\d.*");
                    
             if (!isValid) {      
               System.out.println("Password must be at least 8 characters and contain a number.");    
             }
        } while (!isValid);           
            System.out.println("Password accepted!");           
        */                                          
       //Task 3 Student grades average and result 
   /*     
       int[] grades = {60,76,96,45,34};
       int numberOfStudents = grades.length;
       int sum = 0;
       double average;
       int passingThreshold = 50;
       
       for (int i =0; i < numberOfStudents; i++){
        sum = sum + grades[i];
       }
       average = (double) sum / numberOfStudents;
       
       System.out.println("Student Grades: ");
        for (int i = 0; i < numberOfStudents; i++){
       System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
       System.out.println("Average Grade:" + average);
       
       if (average >= passingThreshold){
       System.out.println("Result: Pass");
            }else{
        System.out.println("Result: Fail");
       }
    */   
       //Task 4 Find the highest score 
        /*
       int[] scores = {45,60,76,89,99};
       int highestScore = scores[0];
       
       for (int i = 1; i < scores.length; i++){
       if (scores[i] > highestScore){
       highestScore = scores[i];
       }
       }
       System.out.println("The highest score is: " + highestScore);
    */       
      //Task 5   Simple Library System
       /*
       String[] books = new String[10];
       int bookCount = 0;
       Scanner sc = new Scanner(System.in);
       int choice;
       
       do{
       System.out.println("\nLibrary menu: ");
       
       System.out.println("1. Add Book");
       
       System.out.println("2. Display Books");
       
       System.out.println("3. Search Book by Name");
       
       System.out.println("4. Exit");
       
       System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();
          switch (choice){
        
          case 1: if (bookCount < books.length){ 
        System.out.print("Enter the name of the book being added: ");                         
        String newBook = sc.nextLine();
        
        books[bookCount] = newBook;
        bookCount++;
        
        System.out.println("\"" + newBook + "\" added to the library.");
          } else{
        System.out.println("Library is full. Cannot add more books.");
          }
        break;
        
        case 2: if ( bookCount > 0){
        System.out.println("\nBooks in the library: ");
        for (int i = 0; i < bookCount; i++){
        System.out.println((i+1) + ". " + books[i]);
          }
          }else{
        System.out.println("The library is empty.");
          }
        break;
        
        case 3: 
        System.out.print("Enter the name of the book you are looking for: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < bookCount;i++){
        if (books[i].equalsIgnoreCase(searchName)){
        System.out.print("\"" + books[i] +"\" found at position " + (i+1) + ".");
        found = true;
        break;
          }
          }
          if (!found){
          System.out.println("Book \"" + searchName + "\" not found in the Library" );
          }
          break;
          
        case 4:
        System.out.println("Exiting the library system. Goodbye!");
        break;
        
        default:
     
       System.out.println("Invalid choice select a number between 1 and 4");
          }
       }while (choice != 4); 
*/
      }
}
