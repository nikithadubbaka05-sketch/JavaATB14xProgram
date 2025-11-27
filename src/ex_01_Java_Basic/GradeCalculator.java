package ex_01_Java_Basic;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = scanner.nextInt();

        char grade;

        if (score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >= 80 && score <= 89){
            grade = 'B';
        } else if (score >= 70 && score <= 79){
            grade = 'C';
        } else if (score >= 60 && score <= 69){
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " +grade);
    }
}
