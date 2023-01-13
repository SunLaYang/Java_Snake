import java.util.ArrayList;

public class Outer {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2}}, {{3, 4}, {5}, {6}}, {{7, 8}, {9, 10}}, {{3, 4}, {4, 1}}, {{}, {43, 13}}};
        int[] array = flatten(arr);
        for (int n : array) {
            System.out.print(n + " ");//1 2 3 4 5 6 7 8 9 10 3 4 4 1 43 13
        }
    }

    public static int[] flatten(int[][][] arr) {
        //參數 'arr' is an array of arrays of arrays of Integers
        ArrayList<Integer> r = new ArrayList<>();
        //'a' is an array of arrays of integers
        for(int[][] a : arr) {
            //b is an array of integers
            for(int[] b:a){
                for(int c : b){
                    r.add(c);
                }
            }
        }
        //r是一個ArrayList 要換成 Array
        int[] result = new int[r.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = r.get(i);
        }
        return result;
    }
}


