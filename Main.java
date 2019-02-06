/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a positive integer.");
        
        int input = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i < input + 1; i++){
            sum += i;
        }
        
        System.out.println("The sum of the integers from 1 to " + input 
        + " is " + sum + ".");
        
        
    }
}
