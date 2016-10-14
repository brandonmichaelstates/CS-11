/* GCD.java
 * Nivetha Sivaprakasam
 * nsivapra
 * pa3
 * Prompts user for 2 positive integers, and prints GCD of the 2 numbers.
 */

import java.util.Scanner;

 class GCD {
 
   public static void main(String []args) {
 
   Scanner sc= new Scanner(System.in);
   int X,Y;
 
   System.out.print("Enter a positive integer: ");
    while(true) { 
    while(!sc.hasNextInt()){ 
     sc.next();
     System.out.print("Please enter a positive integer: ");
     } 
     X = sc.nextInt();
     if (X>0) break; 
     System.out.print("Please enter a positive integer: ");
     }

     System.out.print("Enter another positive integer: ");

     while(true) {
     while(!sc.hasNextInt() ) {
     sc.next();
     System.out.print("Please enter a positive integer: "); 
    }
    Y = sc.nextInt();
    if (Y>0) break;
    System.out.print("Please enter a positive integer: ");
   }
   
     GCD(X,Y); 
   }

   static void GCD(int a, int b) {
     int X =Math.max(a,b);
     int Y =Math.min(a,b);

     while (Y != 0) {
       int G = X%Y;
         X = Y;
         Y = G;
     }
      
     System.out.println("The GCD of "+a+" and "+b+" is "+X );
     System.out.println(" ");
   }
 }
       
