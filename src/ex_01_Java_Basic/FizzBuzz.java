package ex_01_Java_Basic;

import java.util.Scanner;
import java.lang.*;

public class FizzBuzz {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        for(int i = 1; i<=n; i++)
        {
            if(i % 3==0 && i % 5==0)
            {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            } else if(i % 5==0)
            {
                System.out.println("Buzz");
            } else
            {
                System.out.println(i);
            }
        }


    }
}
