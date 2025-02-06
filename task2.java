/*
        Task 2: Sort Three Integers
        Sort and display three user-entered integers in ascending order without using built-in sorting functions.

        Input: Ask for three integers.
        Sort: Compare and arrange them in ascending order.
        Swap if the first number is greater than the second.
        Swap if the second number is greater than the third.
        Repeat the first step for accuracy.
        Output: Show the numbers in ascending order.
*/
//Imports
import java.util.Arrays;
import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        //Variables
        float[] arr = {1, 2, 3};
        float hold;
        Scanner input = new Scanner(System.in);

        //User Input
        System.out.print("#1: ");
        arr[0] = input.nextInt();
        System.out.print("#2: ");
        arr[1] = input.nextInt();
        System.out.print("#3: ");
        arr[2] = input.nextInt();

        //Nested for loop nightmare begins
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                if(arr[j] > arr[j + 1]){
                    hold = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = hold;
                }
            }
        }

        //Prints out the contents of the array (arr) as a string
        System.out.println(Arrays.toString(arr));
    }
}