package CodingChallenge6;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the max possible score for this exam:");
        int maxScore = scanner.nextInt();

        System.out.print("\nHow many students took the exam:");
        int numStudents = scanner.nextInt();

        int [] scores = new int[numStudents];

        System.out.println("\nEnter each student score.\n");

        for (int i = 0; i < scores.length; i++){
            System.out.print("Student" + (i + 1) + ": ");
            scores [i] = scanner.nextInt();
        }

        System.out.println("\n----Statistics----\n");

        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            double studentScore = scores [i];
            double studentPercentage = ((double) scores [i] / maxScore) * 100;

            System.out.println("Student" + (i + 1) + ": " + studentScore + "/" + maxScore + " " + "(" + studentPercentage + "%)");

            sum += studentScore;

        }











    }





























}
