import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // String people[] = new String[5];
        // int matrix[][] = new int[4][3];
        // matrix[0][1] = 12;
        // matrix[1][0] = 3;
        // final float PI = 3.14F;
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerAge = new Scanner(System.in);
        Scanner scannerAddress = new Scanner(System.in);

        System.out.print("Nama : ");
        String inputName = scannerName.nextLine();

        System.out.print("Usia : ");
        int inputAge = scannerAge.nextInt();

        int birthYear = Calendar.getInstance().get(Calendar.YEAR) - inputAge;

        System.out.print("Alamat : ");
        String inputAddress = scannerAddress.nextLine();

        System.out.println();
        System.out.println("Nama anda " + inputName + "\nUsia " + inputAge + " tahun\nTinggal di " + inputAddress
                + "\nLahir tahun " + birthYear);

    }
}