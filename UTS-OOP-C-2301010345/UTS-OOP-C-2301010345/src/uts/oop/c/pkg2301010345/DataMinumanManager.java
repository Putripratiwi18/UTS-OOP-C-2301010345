/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.oop.c.pkg2301010345;

/**
 *
 * @author PC-A-30
 */
public class DataMinumanManager {
    private final Minuman[] minumanList; // Array untuk menyimpan objek minuman
    int size; // Menyimpan jumlah data yang ada

    // Constructor untuk menginisialisasi kapasitas array
    public DataMinumanManager(int kapasitas) {
        minumanList = new Minuman[kapasitas];
        size = 0; // Ukuran awal array adalah 0
    }

    // Method untuk menambah data minuman
    public void addMinuman(String nama, double harga) {
        if (size < minumanList.length) {
            minumanList[size] = new Minuman(nama, harga); // Menambahkan minuman baru
            size++;
            System.out.println("Minuman berhasil ditambahkan!");
        } else {
            System.out.println("Data sudah penuh."); // Jika array sudah penuh
        }
    }

    // Method untuk menampilkan data minuman
    public void displayMinuman() {
        if (size == 0) {
            System.out.println("Tidak ada data minuman."); // Jika tidak ada data minuman
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + minumanList[i]); // Menampilkan semua minuman
            }
        }
    }

    // Method untuk mengubah data minuman
    public void updateMinuman(int index, String namaBaru, double hargaBaru) {
        if (index >= 0 && index < size) {
            minumanList[index].setNama(namaBaru); // Mengubah nama minuman
            minumanList[index].setHarga(hargaBaru); // Mengubah harga minuman
            System.out.println("Minuman berhasil diperbarui!");
        } else {
            System.out.println("Index tidak valid."); // Jika index tidak valid
        }
    }

    // Method untuk menghapus data minuman
    public void deleteMinuman(int index) {
        if (index >= 0 && index < size) {
            // Menggeser data setelah index yang dihapus
            for (int i = index; i < size - 1; i++) {
                minumanList[i] = minumanList[i + 1];
            }
            minumanList[size - 1] = null; // Menghapus data terakhir
            size--;
            System.out.println("Minuman berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid."); // Jika index tidak valid
        }
    }
}


