import java.util.Random;
import java.util.Scanner;

public class qusation {
    public static void main(String[] args) {
        int[] array = {5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677};
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("========================");
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("========================");
        shuffle(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] shuffle(int[] arr) {
        //思路: 隨機生成一個在陣列裡面的數，然後把目前的值跟選定的值互換，然後換過的那格就不動，再把下一個值(包含他自己)跟剩下的
        // 所有值隨便選定一個互換，然後不斷重複這個動作
        int currentIndex = arr.length -1;//代表陣列的最後一格
        while (currentIndex > 0){
            Random random = new Random();
            int i = random.nextInt(currentIndex + 1);
            //與陣列裡的數交換這個隨機數
            int temp = arr[currentIndex];
            arr[currentIndex] = arr[i];
            arr[i] = temp;
            currentIndex--;//避免出現無限迴圈
        }
        return arr;
    }

}
