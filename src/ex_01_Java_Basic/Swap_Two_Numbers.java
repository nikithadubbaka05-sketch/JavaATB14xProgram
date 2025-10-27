package ex_01_Java_Basic;

public class Swap_Two_Numbers {

    public static void main(String[] args) {
        int a = 30, b = 40;
        System.out.println("Before swapping values are:"+a+" "+b);

        //Logic1 - Third variable
        /*int t=a;
        a=b;
        b=t;*/

        //Logic2 - use + & - without using third variable
        /*a=a+b;   //30+40=70
        b=a-b;   //70-40=30
        a=a-b;*/   //70-30=40

        //Logic3 - use + & / - without using third variable
        //here a & b values should not be zero
       a=a*b; //30*40=120
        b=a/b;  //120/40=30
        a=a/b;  //120/30=40

        //Logic4 - bitwise XOR


        System.out.println("After swapping values are:"+a+" "+b);
    }

}
