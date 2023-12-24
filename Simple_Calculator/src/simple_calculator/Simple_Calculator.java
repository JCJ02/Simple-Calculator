/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple_calculator;

// Imports
import java.util.Scanner;

public class Simple_Calculator {
    
    
    public static void greetings() {
        System.out.println("+=========================================+");
        System.out.println("|                                         |");
        System.out.println("|             Simple Calculator           |");
        System.out.println("|                                         |");
        System.out.println("+=========================================+");  
    }
    
    
    public static void operations(double numberOne, double numberTwo, char operator) {
        
        //Initialize variables
        double results;
        
        switch(operator) {
            case '+':
                results = numberOne + numberTwo;
                System.out.println("\nAddition: " + numberOne + " + " + numberTwo + " = " + results);
                break;
            case '-':
                results = numberOne - numberTwo;
                System.out.println("\nSubtraction: " + numberOne + " - " + numberTwo + " = " + results);
                break;
            case '*':
                results = numberOne * numberTwo;
                System.out.println("\nMultiplication: " + numberOne + " x " + numberTwo + " = " + results);
                break;
            case '/':
                results = numberOne / numberTwo;
                System.out.println("\nDivision: " + numberOne + " / " + numberTwo + " = " + results);
                break;
            case '%':
                results = numberOne % numberTwo;
                System.out.println("\nModulus: " + numberOne + " % " + numberTwo + " = " + results);
            default:
                System.out.println("\nTHIS " + operator + " YOU ENTERED IS NOT AN OPERATOR!");
        }
        
        
    }
    
    
    public static void input() {
        
        //Initialize variables
        double numberOne, numberTwo;

        greetings();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nInstruction: Enter 1st and 2nd number in order to calculate it by selected operator.\n");
        System.out.print("Enter number: ");
        numberOne = scanner.nextDouble();
        
        System.out.print("Enter number: ");
        numberTwo = scanner.nextDouble();
        
        System.out.println("\nOperators: + - / * %");
        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("\nRESULTS");
        
        operations(numberOne, numberTwo, operator);
        

    }

    
    public static void output() {
        input();
    }
    
    public static void main (String args[]) {
        output();
        
    }
    
}
