/*
Write a Java program that allows a user to input a positive integer which must be between 1 and 20, and then uses loops to perform the following calculations:

Using a while loop, find the sum of the first N odd numbers, where N is the integer entered by the user.
Using a do-while loop, find the factorial of the integer entered by the user.
A factorial is a mathematical operation that you write like this: n! .
It represents the multiplication of all numbers between 1 and n.
So if you were to have 3!  for example, you'd compute 3 x 2 x 1 (which = 6).
 */
//import Scanner
import java.util.Scanner;
public class Lab4b{
    public static void main(String[] args){
//Part 1
    //declare variables
        int hold = 1;
    //Create scanner object
        Scanner input = new Scanner(System.in);
    //prompt for input
        System.out.print("Please enter an integer between 1-20: ");
        int n = input.nextInt();
    //while loop
        while(hold < n*n){
            hold += 1;
        }
        System.out.println("Sum of the first "+n+" odd numbers: "+hold);



//Part 2
    //Prompt for input again
        System.out.print("Please enter another integer between 1-20: ");
    //Assign n to a new value
        n = input.nextInt();
    //Variables
        int i = 1;
        hold = 1;
    //do-while loop
        do{
            hold *= i;
            i++;
        }
        while (i <= n);
    //Print the factorial
        System.out.println("Factorial of "+n+" using a do-while loop "+hold);
    }
}



//Extra stuff
/*
     for(int i = 0; i <=n*2; i++){
            if(i%2 != 0){
                hold += i;
            }
    System.out.println(n*n);
 */