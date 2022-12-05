package CodingChallenge6;

import java.util.Scanner;

public class Ex4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;

        int min = 1;
        int max = 100;
        int guess = 50;

        System.out.println("***Guess My Number Game***");
        System.out.println("\n---Rules---\n");
        System.out.println("-Think of a number from 1 to 100 and i will guess it.");
        System.out.println("-Enter \"higher\" if my guess is too low.");
        System.out.println("-Enter \"lower\" if my guess is too high.");
        System.out.println("-Enter \"correct\" if my guess is right.");

        while (true ) {

            System.out.println("\nI guess " + guess + ".\n");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = guess + 1;

            } else if (input.equals("lower")) {
                max = guess + 1;

            } else if (input.equals("correct")) {
                System.out.println("\n" + guess + ", easy peasy!");

                break;

            }

            guess = (min + max) / 2;

            if (min == max + 1){
                System.out.println("\nThats not possible. Lets try again.");

                min = 1;
                max = 100;
                guess = 50;
            }


        }



    }




















}
