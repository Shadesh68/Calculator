/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.calculator;

/**
 *
 * @author Administrator
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        int num1=0;
        int num2=0;
        char operator;
        double answer = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first number : ");
        num1 = input.nextInt();
        System.out.println("Enter your second number : ");
        num2 = input.nextInt();
        System.out.println("What operation? ");
        operator = input.next().charAt(0);
        
        switch(operator){
            
            case '+' : answer = num1 + num2;
                break;
                
            case '-' : answer = num1 - num2;
                break;
                
            case '*' : answer = num1 * num2;
                break;
                
            case '/' : answer = num1 / num2;
                break;
        }
        
        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
    
    
    }

