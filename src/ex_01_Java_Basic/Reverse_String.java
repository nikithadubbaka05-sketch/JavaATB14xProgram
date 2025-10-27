package ex_01_Java_Basic;

public class Reverse_String {
    public static void main(String[] args) {

        //1. Using + (String concatenation) operator
        String str = "Nikki";
        String rev = "";

        int len = str.length(); //5

        //str.CharAt(0);

        for(int i=len-1; i>=0; i--) //4 3 2 1
        {
            rev = rev+str.charAt(i); //ikkiN

        }
            System.out.println("Reversed String is: " +rev);


    }
}
