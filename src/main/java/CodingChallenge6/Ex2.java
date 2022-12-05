package CodingChallenge6;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = new String[]{

                "Grelka is kind",
                "Astrid is trustworthy",
                "Skyrim is the best game ever",
                "Vindhelm has summer weather",
                "I own Lakeside Manor"
        };

        boolean[] answers = new boolean[]{

                false,
                false,
                true,
                false,
                true
        };

        boolean[] userAnswers = new boolean[5];

        int finalScore = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("\nQuestion" + ": " + questions[i] + ". True or false?");

            System.out.print("\nYour answer: \n");

            userAnswers[i] = scanner.nextBoolean();

            if (userAnswers[i] == answers[i]) {
                System.out.println("\nCorrect!");
                finalScore++;
            }
            else {
                System.out.println("\nWrong. It is " + answers[i] + ".");
            }

        }

        System.out.println("\nYour final score is " + finalScore + " out of five.");



}













































}
