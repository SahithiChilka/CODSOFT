/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizappwithtimer;

/**
 *
 * @author chilk
 */
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizAppWIthTimer {

    /**
     * @param args the command line arguments
     */
    private static final int TIME_LIMIT = 10; // Time limit for each question in seconds
    private static int score = 0;
    private static boolean answered = false;
    private static Timer timer;
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] questions = {
                {"What is the capital of France?", "a) Berlin", "b) Paris", "c) Rome", "d) Madrid", "b"},
                {"What is the largest planet in our Solar System?", "a) Earth", "b) Mars", "c) Jupiter", "d) Saturn", "c"},
                {"Who wrote 'Hamlet'?", "a) Charles Dickens", "b) J.K. Rowling", "c) Mark Twain", "d) William Shakespeare", "d"},
                {"How many minutes in a full week?","a) 10080","b) 10041","c) 10301","d) 10801","a"}
        };

        Scanner scanner = new Scanner(System.in);

        for (String[] question : questions) {
            displayQuestion(question);
            answered = false;

            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!answered) {
                        System.out.println("\nTime's up!");
                        promptNextQuestion();
                    }
                }
            }, TIME_LIMIT * 1000);

            String answer = scanner.nextLine();
            if (answered) {
                continue;
            }
            answered = true;
            timer.cancel();

            if (answer.equalsIgnoreCase(question[5])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is " + question[5]);
            }
            promptNextQuestion();
        }

        System.out.println("\nQuiz over! Your score: " + score + "/" + questions.length);
        scanner.close();
    }

    private static void displayQuestion(String[] question) {
        System.out.println("\n" + question[0]);
        for (int i = 1; i <= 4; i++) {
            System.out.println(question[i]);
        }
        System.out.print("Your answer: ");
    }

    private static void promptNextQuestion() {
        System.out.println("\nPress Enter to continue to the next question...");
        new Scanner(System.in).nextLine();
    
        
    }
    
}
