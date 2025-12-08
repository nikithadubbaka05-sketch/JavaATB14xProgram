package ex_01_Java_Basic;

public class StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {
        //String - 90% used
        //String s0 = "Nikitha";
        //String s1 = new String("Nikitha");

        //Less than <10% used
        //StringBuffer stringBuffer = new StringBuffer("Nikitha"); // thread-safe
        //StringBuilder stringBuilder = new StringBuilder("Nikitha"); //not thread-safe

        StringBuffer stringBuffer = new StringBuffer("Nikitha");
        stringBuffer.append(" Dubbaka");
        System.out.println(stringBuffer);

        String s1 = "Nikitha";
        s1 = s1 + " Dubbaka";
        System.out.println(s1); //we have two strings as strings are immutable


        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
