package ex_01_Java_Basic;

import java.util.Scanner;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<rows-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
