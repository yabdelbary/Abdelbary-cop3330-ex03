package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */

public class App
{
    public static void main( String[] args )
    {
       System.out.println("what is the quote?");
       Scanner sc1 = new Scanner(System.in);
       String name = sc1.nextLine();
       System.out.println("who said it?");
       String obi = sc1.nextLine();
       System.out.println(obi+ " says, "+ "\""+ name+"\"");

    }
}
