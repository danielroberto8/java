package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Tampilan Menu :");
            System.out.println("1. Tambah buah");
            System.out.println("2. List buah");

            Scanner option = new Scanner(System.in);
            System.out.print("Pilih menu : ");
            byte opsi = option.nextByte();

            switch (opsi) {
                case 1:
                    Menu.loadTambahBuah();
                    break;
                case 2:
                    Menu.loadDaftarBuah();
                    break;
                default:
                    System.out.println("Input salah");
            }
            System.out.print("\nIngin mengulanginya lagi? (Y/N) ");
            Scanner repeat = new Scanner(System.in);
            String isRepeat = repeat.next();
            if (isRepeat.equalsIgnoreCase("N")) {
                break;
            }
            System.out.println("");
        }
    }
}
