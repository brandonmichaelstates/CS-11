
/* Guess.java  
 * Nivetha Sivaprakasam
 * nsivapra
 * pa2
 * Interactive game that allows three guesses to determine the random integer.
 */

 import java.util.Scanner;
 
 class Guess {

  public static void main( String[] args ){
    int x;
    int N=(int)(Math.random()*10)+1;
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" ");
    System.out.println("I'm thinking of an integer in the range 1 to 10.  You have three guesses.");
    System.out.println(" ");
    System.out.print("Enter your first guess: ");
    x = sc.nextInt();

    if (x<N) {
    System.out.println("Your guess is too low.");
    System.out.println(" ");
   } else if (x==N) {
    System.out.println("You win!");
    System.out.println(" ");
    System.exit(N);
   } else {
    System.out.println("Your guess is too high.");
    System.out.println(" ");
   }
   
    System.out.print("Enter your second guess: ");
    x=sc.nextInt();
   
    if (x<N) {
    System.out.println("Your guess is too low.");
    System.out.println(" ");
   } else if (x==N) {
    System.out.println("You win!");
    System.out.println(" ");
    System.exit(N);
   } else {
    System.out.println("Your guess is too high.");
    System.out.println(" ");
   }

    System.out.print("Enter your third guess: ");
    x=sc.nextInt();
   
    if (x<N) {
    System.out.println("Your guess is too low.");
    System.out.println(" ");
   } else if (x==N) {
    System.out.println("You win!");
    System.out.println(" ");
    System.exit(N);
   } else {
    System.out.println("Your guess is too high.");
    System.out.println(" ");
   }
    
                     
    System.out.print("You lose.  The number was ");
    System.out.println(N+".");
    System.out.println(" ");  
   }
 }    

