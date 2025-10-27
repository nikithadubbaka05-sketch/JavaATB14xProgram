package ex_01_Java_Basic;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        //Using algorithm
       /* int rev = 0;

        while(num!=0)
        {
            rev=rev*10 +num%10;
            num=num/10;
        }*/

        //Using StringBuffer class
      /*  StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("Reverse Number is: "+rev);*/

        //Using StringBuilder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();

        System.out.println("Reverse Number is: "+rev);
    }

}
