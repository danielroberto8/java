import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Cicilan {
    static double bunga;
    static int durasi;
    static int hargaAwal;
    static double bayarPerBulan;
    static final int PERCENT = 100;
    static final int BULAN_DALAM_TAHUN = 12;

    public static void loadMainMenu() {

        System.out.println("---------- PEMBAYARAN SETIAP BULAN ----------");

        while (true) {
            hargaAwal = (int) Cicilan.inputHandlerDouble("Masukkan harga awal : ");
            if (hargaAwal >= 1000000) {
                break;
            }
            System.out.println("Harga tidak boleh lebih kecil dari 1 juta.");
        }

        while (true) {
            durasi = (int) Cicilan.inputHandlerDouble("Masukkan durasi cicilan (tahun) : ");
            if (durasi >= 1) {
                break;
            }
            System.out.println("Durasi cicilan tidak boleh lebih kecil dari 1 tahun.");
        }

        while (true) {
            bunga = (int) Cicilan.inputHandlerDouble("Masukkan bunga : ");
            if (bunga >= 0 && bunga <= 100) {
                break;
            }
            System.out.println("Bunga tidak boleh lebih kecild dari 0%.");
        }

        bayarPerBulan = (hargaAwal + (hargaAwal * bunga / PERCENT)) / (durasi * BULAN_DALAM_TAHUN);

        System.out.println("cicilan per bulan " + Cicilan.formatKursIDR(bayarPerBulan));

        System.out.print("Apakah anda ingin melihat simulasi cicilan (y/n) ? ");
        String repeat = Cicilan.strScanner.nextLine();

        if (repeat.equalsIgnoreCase("Y")) {
            Cicilan.loadSimulasiCicilan();
        }
    }

    public static void loadSimulasiCicilan() {
        System.out.println("\n---------- SISA BAYARAN PER BULAN ----------");
        double sisaBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
        for (int i = 0; i < durasi * BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= bayarPerBulan;
            System.out.println("Bulan ke-" + (i + 1) + ": " + Cicilan.formatKursIDR(sisaBayaran));
        }
    }

    public static double inputHandlerDouble(String message) {
        System.out.print(message);
        return Cicilan.inputScanner.nextDouble();
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