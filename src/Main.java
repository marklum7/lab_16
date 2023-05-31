import java.util.Arrays;
import java.util.Scanner;

public class Main{
    interface lambda {
        boolean srav(int x, int y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] sortArr = new int[N];
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = in.nextInt();
        }
        System.out.println("по убыванию");
        bubblesort(sortArr, ((x, y) -> x < y));
        for (int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }

        System.out.println("по возрастанию");
        bubblesort(sortArr, ((x, y) -> x > y));
        for (int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }
    }
    private static void bubblesort(int [] array, lambda uslov) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (uslov.srav(array[i], array[j])) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}