package OOP.src;

public class Buah {
    private String namaBuah;
    private int hargaBuah;
    private int stokBuah;

    public Buah(String nama, int harga, int stok) {
        setNamaBuah(nama);
        setHargaBuah(harga);
        setStokBuah(stok);
    }

    public void setNamaBuah(String namaBuah) {
        if (namaBuah == "") {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        this.namaBuah = namaBuah;
    }

    public String getNamaBuah() {
        return this.namaBuah;
    }

    public void setHargaBuah(int hargaBuah) {
        if (hargaBuah <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.hargaBuah = hargaBuah;
    }

    public int getHargaBuah() {
        return this.hargaBuah;
    }

    public void setStokBuah(int stokBuah) {
        if (stokBuah < 0) {
            throw new IllegalArgumentException("Invalid input.");
        }
        this.stokBuah = stokBuah;
    }

    public int getStokBuah() {
        return this.stokBuah;
    }
}