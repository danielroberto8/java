import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int length = 0;
        boolean isAscending = true;

        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan angka awal :");
        byte a = angka.nextByte();
        System.out.print("Masukkan angka akhir :");
        byte b = angka.nextByte();
        angka.close();

        // if (a > b) {
        // length = a - b;
        // isAscending = false;
        // } else {
        // length = b - a;
        // }

        // int arr[] = new int[length + 1];
        // int start = a;

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = start;
        // if (isAscending) {
        // start++;
        // } else {
        // start--;
        // }
        // }

        // System.out.println(Arrays.toString(arr));
        System.out.println(generateArrayFromRange(a, b));
    }

    public static ArrayList<Integer> generateArrayFromRange(int a, int b) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if (a < b) {
            for (int i = a; i < b + 1; i++) {
                numbers.add(i);
            }
        } else {
            for (int i = a; i > b - 1; i--) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}