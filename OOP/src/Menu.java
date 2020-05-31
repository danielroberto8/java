package OOP.src;

import java.util.Scanner;

public class Menu {

    public static void loadTambahBuah() {
        Scanner namaBuah = new Scanner(System.in);
        Scanner hargaBuah = new Scanner(System.in);
        Scanner stokBuah = new Scanner(System.in);

        System.out.print("\nMasukkan nama buah : ");
        String nama = namaBuah.nextLine();
        System.out.print("Masukkan harga buah : ");
        int harga = hargaBuah.nextInt();
        System.out.print("Masukkan stok buah : ");
        int stok = stokBuah.nextInt();

        Buah buah = new Buah(nama, harga, stok);
        System.out.println("\nNama buah " + buah.getNamaBuah() + " dengan harga Rp." + buah.getHargaBuah()
                + " dan jumlah " + buah.getStokBuah() + "\nBerhasil ditambahkan.");
        App.listBuah.add(buah);
    }

    public static void loadDaftarBuah() {
        System.out.println("\nDaftar Buah segar");
        for (int i = 0; i < App.listBuah.size(); i++) {
            System.out.println((i + 1) + ". " + App.listBuah.get(i).getNamaBuah() + " Rp."
                    + App.listBuah.get(i).getHargaBuah() + " Stock: " + App.listBuah.get(i).getStokBuah() + " pcs");
        }
    }

}