package ex_01_Java_Basic;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = {90, 91, 94, 96, 56};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        //System.out.println(marks[-1]);

        String name = "nikitha";
        String [] nameschar = name.split(""); //string array
       for (String s: nameschar){
           System.out.println(s);
       }

       //1st way: declaration and initialization
        int[] mark = {1,2,3,4,5,6,7,8};

       //2nd way: creating the array
        int[] marks1 = new int[5];
        int marks2[] = new int[5]; //fixed size

        String[] names = {"pramod", "amit", "lucky"};

        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        int[] score = {51, 34, 45, 66, 70};

        for(int i = 0; i <score.length; i++){
            System.out.println(score[i]);
        }

        for(int marke: score){
            System.out.println(marke);
        }


    }

    public static void sort(int[] array) {
    }
}
