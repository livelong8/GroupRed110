import java.util.Scanner;
public class Lab2c_CookieRecipe {
    public static void main(String[] args){
            /*
        Task2: Cookie Recipe Adjuster

        Create a new class called "Lab2c_CookieRecipe"
        In the main method, initialize the ingredient amounts for 36 cookies: 1.5 cups of sugar, 1 cup of butter, and 2.5 cups of flour.
        Create a new Scanner object to read input from the user.
        Prompt the user to enter the number of cookies they want to make.
        Use the number of cookies entered to calculate the number of cups of each ingredient needed using the initial ingredient amounts for 36 cookies.
        Hint: you can use the formula IngredientNeeded = IngredientAmount * (numCookies / 36.0)
        Print out the number of cups of each ingredient needed.
        Add comments and proper indentation to your code to make it clear and easy to understand.
        Test your program by running it and making sure it correctly calculates and displays the ingredient amounts for the number of cookies entered by the user.
        Submit your program with the source code and a screenshot of it running correctly.
         */
        //varibles
        double sugar = 1.5;
        double butter = 1.0;
        double flour = 2.5;
        int base = 36;
        Scanner input = new Scanner(System.in);
        //base ingredient is 1.5
        //input
        System.out.print("How many cookies do you want to make: ");
        int cookie = input.nextInt();
        //output
        System.out.println("You will need "+cookie*(sugar/36)+" cups of sugar, "+cookie*(butter/36)+" cups of butter, and "+cookie*(flour/36)+" cups of flour");
    }
}
