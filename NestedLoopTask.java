/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sting
 */
public class NestedLoopTask {
    public static void main(String[] args){
    //Task 1   
    
    for (int i = 1; i <= 10; i++){
         for (int j = 1; j <= 10; j++){    
    System.out.println(i + " x " + j + " = "+ (i*j));
         }
    }
      
    //Task 2  
      /*  
      int n = 4; 
        
        for (int i = 1; i <= n; i++ ){
        
            for (int j = 1; j <= n; j++ ){
             System.out.print("*");
            }
            System.out.println();  
        }    
        */
    //Task 3    
    /*
     int n = 5;    
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
*/
    //Task 4
/*
int n = 5;    
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
            System.out.print(j + " ");
            }
            System.out.println();
        }
*/
   //Task 5 
  /*
   int n = 4;
   for (int i = n; i >= 1; i--){
       for (int j = 1; j <= i; j++){
       System.out.print("*");
       }
       System.out.println();
   }
    */    
           
   //Task 6
    /*
   int n = 4;     
   for (int i = 1; i <= n; i++){     
        for (int j = 1; j <=n - i; j++){
        System.out.print(" ");    
        }
       for (int k = 1; k <= 2 * i - 1; k++){
       System.out.print("*");    
       }   
       System.out.println();
   }
  */
  //Task 7 
  /*
  int n = 4;
  int num = 1;
  
  for (int i = 1; i <= n; i++){
    for (int j = 1; j <= i; j++){
  System.out.print(num + " ");
  num++;
    }
    System.out.println();
  }
 */
  //Task 8 
    /*
  int n = 5;      
  for (int i = 0; i < n; i++){      
      for (int j = 0; j < n -i -1; j++){  
        System.out.print(" ");
      }
   int num = 1;
   for (int j = 0; j<= i; j++){     
   System.out.print(num + " ");
   num = num * (i - j)/(j + 1);
   }
   System.out.println();
   }
*/
    }    
}

