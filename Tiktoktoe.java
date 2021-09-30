package com.bridgelabz;
import java.util.Scanner;

public class Tiktoktoe {
    public static char[] b=new char[10];
    public static Scanner scan=new Scanner(System.in);
    public static void initializeboard(){
        b[0]=' ';
        b[1]=' ';
        b[2]=' ';
        b[3]=' ';
        b[4]=' ';
        b[5]=' ';
        b[6]=' ';
        b[7]=' ';
        b[8]=' ';
        b[9]=' ';
    }
    public static void showboard()
    {
        System.out.println("\n Initially the board is empty \n");
        System.out.println("|-----------|");
        System.out.println("| " + b[1] + " | "+ b[2] + " | " + b[3]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " + b[4] + " | "+ b[5] + " | " + b[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + b[7] + " | " + b[8] + " | " + b[9] + " |");
        System.out.println("|-----------|");
    }

    
    public static void main(String[] args) {
        initializeboard();
        showboard();
    }

}