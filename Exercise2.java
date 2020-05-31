import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Scanner angka = new Scanner(System.in);

        System.out.print("Masukkan angka :");
        int input = angka.nextInt();

        System.out.println(include(arr, input));
    }

    public static boolean include(int arr[], int key) {
        boolean res = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                res = true;
                break;
            }
        }

        return res;
    }
}