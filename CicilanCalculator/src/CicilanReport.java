package CicilanCalculator.src;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class CicilanReport {

    public static void loadMainMenu() {

        System.out.println("---------- PEMBAYARAN SETIAP BULAN ----------");

        CicilanCalculator.hargaAwal = (int) CicilanReport.inputHandlerDouble("Masukkan harga awal : ", 1000000, 0);
        CicilanCalculator.durasi = (int) CicilanReport.inputHandlerDouble("Masukkan durasi cicilan (tahun) : ", 1, 0);
        CicilanCalculator.bunga = (int) CicilanReport.inputHandlerDouble("Masukkan bunga : ", 0, 100);

        System.out.println(
                "cicilan per bulan " + CicilanReport.formatKursIDR(CicilanCalculator.calculateBayarPerBulan()));

        System.out.print("\nApakah anda ingin melihat simulasi cicilan (y/n) ? ");
        String repeat = CicilanReport.strScanner.nextLine();

        if (repeat.equalsIgnoreCase("Y")) {
            CicilanReport.loadSimulasiCicilan();
        }
    }

    public static void loadSimulasiCicilan() {
        System.out.println("\n---------- SISA BAYARAN PER BULAN ----------");
        double sisaBayaran = CicilanCalculator.calculateSisaBayaran();
        for (int i = 0; i < CicilanCalculator.durasi * CicilanCalculator.BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= CicilanCalculator.bayarPerBulan;
            System.out.println("Bulan ke-" + (i + 1) + ": " + CicilanReport.formatKursIDR(sisaBayaran));
        }
    }

    public static double inputHandlerDouble(String message, int minValue, int maxValue) {
        double input;
        while (true) {
            System.out.print(message);
            input = CicilanReport.inputScanner.nextDouble();
            if (input >= minValue && maxValue == 0) {
                break;
            } else if (input >= minValue && input <= maxValue) {
                break;
            } else {
                System.out.println("Invalid input. please try again.");
            }
        }
        return input;
    }

    public static String formatKursIDR(double nominal) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        return kursIndonesia.format(nominal);
    }

    public static Scanner strScanner = new Scanner(System.in);
    public static Scanner inputScanner = new Scanner(System.in);

}