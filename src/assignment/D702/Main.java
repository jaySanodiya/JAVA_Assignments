package assignment.D702;

import java.util.Scanner;

class Main{
    public static String reversString(String input){
        char[] chr = input.toCharArray();

        StringBuilder str = new StringBuilder();


        for (int i=input.length()-1; i>=0;i--){
            str.append(chr[i]);
        }
        return str.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}

