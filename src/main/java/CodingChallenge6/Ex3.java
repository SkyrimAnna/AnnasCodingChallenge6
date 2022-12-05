package CodingChallenge6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input;

        int min = 1;
        int max = 100;

        System.out.println("***Guess My Number Game***");
        System.out.println("\n---Rules---\n");
        System.out.println("-Think of a number from 1 to 100 and i will guess it.");
        System.out.println("-Enter \"higher\" if my guess is too low.");
        System.out.println("-Enter \"lower\" if my guess is too high.");
        System.out.println("-Enter \"correct\" if my guess is right.");

        while (true) {

            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("\nI guess " + randomNumber + ".");
            System.out.print("\nYour response:");
            input = scanner.next();

            if (input.equals("higher")) {
                min = randomNumber + 1;

            } else if (input.equals("lower")) {
                max = randomNumber - 1;

            } else if (input.equals("correct")) {
                System.out.println("\n" + randomNumber + ", eh? i know i get it eventually");

                break;
            }

            if (min == max + 1) {
                System.out.println("\nThats not possible. Lets try again.");

                min = 1;
                max = 100;
            }

        }


        }

}
