package ex_01_Java_Basic;

public class StringFunctions {
    public static void main(String[] args) {
        String name = "Nikitha";

        //1. Length
        System.out.println(name.length());

        //2. charAt
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(11));

        //3. concat
        System.out.println(name.concat(" Dubbaka"));

        //4. contains
        System.out.println(name.contains("om"));

        //5. equals
        System.out.println(name.equals("Nikitha"));

        //6. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("nikitha"));

        //7. indexOf() nikitha -> ? k
        System.out.println(name.indexOf('k'));

        String s1 = "madam";
        //8. Returns the index within this string
        //First occurrence of the specified substring.
        System.out.println(s1.indexOf("d"));

        //9. replace( , )
        System.out.println(name.replace('t', 'T'));

        //10. substring()
        System.out.println(name.substring(1, 3));

        //11. toLowerCase()
        System.out.println("NIKITHA".toLowerCase());

        //12. toUpperCase()
        System.out.println("nikitha".toUpperCase());

        //13. startsWith()
        System.out.println(name.startsWith("N"));

        //14. endsWith()
        System.out.println(name.endsWith("a"));

        //15. trim()
        String name3 = "  Nikitha  ";
        System.out.println(name3.trim());

        //16. compareTo()
        System.out.println(name.compareTo("Nikitha"));


        //StringBuilder
        // and StringBuffer are mutable in nature
        StringBuilder stringBuilder = new StringBuilder("Nikitha");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder); //only one string (reversed) exists in the heap

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

    }
}
