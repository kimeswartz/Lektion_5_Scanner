package com.kim.scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Bättre metod om vi vill att ett kodstycka ska köras minst en gång.
        // break vs return

        boolean isPlaying = true; // true means the code block will run the code with no exit.

        do {

            String result = showScanner();

            if (result.equals("hi")) { //result is connected to the input down in showScanner()
                System.out.println("IT'S TRUE");
            }

        } while (isPlaying);

        // break; we jump out of the entire if statement.


        /*

        Below if we want to check int.

               do {

            int result = showScanner();

            if (result == 0) { //result connected to the input down in showScanner()
                System.out.println("The number is 0");
            }

        } while (isPlaying);

         */

    }

    public static String showScanner() { // Change to int for only number allowance
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert some sentence");
        String input = sc.nextLine(); // What the user put in the terminal

        return input;
    }

}
