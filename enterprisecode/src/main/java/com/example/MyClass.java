package com.example;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        System.out.println("Enter the first code for the self destruct sequence");
        Scanner input1 = new Scanner(System.in);
        String code1 = input1.next();
        if (code1.equals("Code11A"))
        {

            System.out.println("Success");
        }
        else
        {
            System.out.println("MISSION FAILED");
        }
        System.out.println("Enter the second code for the self destruct sequence");
        Scanner input2 = new Scanner(System.in);
        String code2 = input2.next();
        if (code2.equals("Code11A2B"))
        {

            System.out.println("Success");
        }
        else
        {
            System.out.println("MISSION FAILED");

        }

        System.out.println("Enter the third code for the self destruct sequence");
        Scanner input3 = new Scanner(System.in);
        String code3 = input3.next();
        if (code3.equals("Code1B2B3"))
        {

            System.out.println("Success");
        }
        else
        {
            System.out.println("MISSION FAILED");

        }

        System.out.println("Enter the final code for the self destruct sequence");
        Scanner input4 = new Scanner(System.in);
        String code4 = input4.next();
        if (code4.equals("000Destruct0"))
        {
            System.out.println("Success.");
            System.out.println("Auto-destruct will begin in 30 Seconds.");
        }

            else
             {
                System.out.println("MISSION FAILED");

            }
    }
}
