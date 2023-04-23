package com.gl.dsa.bracketchecker;

import java.util.Scanner;

import com.gl.dsa.bracketchecker.BracketChecker;

public class Main {
	 
    public static void main(String[] args) {
       
        System.out.println("Enter the String to check for balance brackets : ");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
    
       
       Boolean result;
        
       
       BracketChecker obj = new BracketChecker();
       
       result = obj.checkingBracketsBalanced(value);
       
       if (result)
           System.out.println("The entered String has Balanced Brackets");
       else
           System.out.println("The entered Strings do not contain Balanced Brackets ");
       
       
   
       
                       
    }
}
 