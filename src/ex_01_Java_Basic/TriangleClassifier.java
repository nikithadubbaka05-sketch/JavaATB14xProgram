package ex_01_Java_Basic;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1");
        int side1 = scanner.nextInt();

        System.out.println("Enter side2");
        int side2 = scanner.nextInt();

        System.out.println("Enter side3");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
