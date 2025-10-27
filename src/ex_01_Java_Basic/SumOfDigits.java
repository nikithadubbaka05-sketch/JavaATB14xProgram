package ex_01_Java_Basic;

public class SumOfDigits {
    public static void main(String[] args) {

        int num=123;
        int sum=0;

        while(num>0)
        {
            sum = sum+num%10; //3
            num = num/10; //12
        }
        System.out.println("Sum of digits is: " +sum);
    }
}
