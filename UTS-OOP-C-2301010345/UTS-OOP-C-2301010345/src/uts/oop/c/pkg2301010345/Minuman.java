package uts.oop.c.pkg2301010345;

/**
 *
 * @author Putri Pratiwi
 TGL 16 MEI 2025
 */
public class Minuman {
    private String nama;
    private double harga;

    // Constructor
    public Minuman(String nama, double harga) {
        this.nama = nama;
        // Menambahkan validasi harga agar tidak negatif
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk harga dengan validasi
    public void setHarga(double harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }

    // Method untuk menampilkan info minuman dengan format yang rapi
    @Override
    public String toString() {
        return String.format("Nama Minuman: %s, Harga: Rp %.2f", nama, harga);
    }
}
