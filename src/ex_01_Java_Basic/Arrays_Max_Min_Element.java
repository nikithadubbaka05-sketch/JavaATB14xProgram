package ex_01_Java_Basic;

public class Arrays_Max_Min_Element {
    public static void main(String[] args) {
        int[] array = {25, 34, 14, 56, 36, 18, 29, 49, 77, 36};

        //Logic
        //Arrays.sort(array);
        //System.out.println(array[array.length-1]);

        //Maximum element in an array
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

        //Minimum element in an array
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
