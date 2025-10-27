package ex_01_Java_Basic;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        //a>b and a>c = a is largest
        //b>a and b>c = b is largest
        //c>a and c>b = c is largest

        //Approach1 Logic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = sc.nextInt();

        System.out.println("Enter Second number:");
        int b = sc.nextInt();

        System.out.println("Enter Third number:");
        int c = sc.nextInt();

        /*if (a>b && a>c)
        {
            System.out.println(a+ " is a largest number");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+ " is a largest number");
        }
        else
        {
            System.out.println(c+ " is a largest number");
        }*/


        //Approach2 - Ternary Operator
        //a>b?a:b (if a>b is true the o/p is 'a' and if a>b is false the o/p is 'b')

       //int largest1 = a>b?a:b; //largest of a and b
       //int largest2 = c>largest1?c:largest1; //largest of c and largest1

        int largest = c>(a>b?a:b)?c:(a>b?a:b);
       System.out.println(largest+ " largest number");


    }

}
