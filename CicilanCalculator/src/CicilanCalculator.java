package CicilanCalculator.src;

public class CicilanCalculator {

    static double bunga;
    static int durasi;
    static int hargaAwal;
    static double bayarPerBulan;
    static final int PERCENT = 100;
    static final int BULAN_DALAM_TAHUN = 12;

    public static double calculateBayarPerBulan() {
        bayarPerBulan = (hargaAwal + (hargaAwal * bunga / PERCENT)) / (durasi * BULAN_DALAM_TAHUN);
        return bayarPerBulan;
    }

    public static double calculateSisaBayaran() {
        double sisaBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
        return sisaBayaran;
    }

}