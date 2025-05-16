/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.oop.c.pkg2301010345;

import java.util.Scanner;

/**
 *
 * @author PC-A-30
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataMinumanManager manager = new DataMinumanManager(5); // Kapasitas array 5 minuman

        while (true) {
            // Menampilkan menu aplikasi
            System.out.println("\nMenu Aplikasi Minuman:");
            System.out.println("1. Tambah Minuman");
            System.out.println("2. Tampilkan Minuman");
            System.out.println("3. Ubah Minuman");
            System.out.println("4. Hapus Minuman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            
            int pilihan;
            
            // Memastikan input yang valid
            while (true) {
                try {
                    pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan < 1 || pilihan > 5) {
                        System.out.println("Pilihan tidak valid, pilih angka antara 1-5.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid, harap masukkan angka.");
                }
            }

            switch (pilihan) {
                case 1: // Tambah minuman
                    System.out.print("Masukkan nama minuman: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga minuman: ");
                    
                    // Memastikan input harga valid
                    double harga = 0;
                    while (true) {
                        try {
                            harga = Double.parseDouble(scanner.nextLine());
                            if (harga <= 0) {
                                System.out.println("Harga harus lebih besar dari 0.");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input harga tidak valid, harap masukkan angka.");
                        }
                    }
                    manager.addMinuman(nama, harga);
                    break;

                case 2: // Tampilkan minuman
                    manager.displayMinuman();
                    break;

                case 3: // Ubah minuman
                    System.out.print("Masukkan index minuman yang ingin diubah (1-" + manager.size + "): ");
                    int indexUpdate = -1;
                    
                    // Memastikan input indeks valid
                    while (true) {
                        try {
                            indexUpdate = Integer.parseInt(scanner.nextLine()) - 1;
                            if (indexUpdate >= 0 && indexUpdate < manager.size) {
                                break;
                            } else {
                                System.out.println("Index tidak valid, pilih antara 1-" + manager.size + ".");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid, harap masukkan angka.");
                        }
                    }

                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan harga baru: ");
                    double hargaBaru = 0;
                    
                    // Memastikan input harga baru valid
                    while (true) {
                        try {
                            hargaBaru = Double.parseDouble(scanner.nextLine());
                            if (hargaBaru <= 0) {
                                System.out.println("Harga harus lebih besar dari 0.");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input harga tidak valid, harap masukkan angka.");
                        }
                    }
                    manager.updateMinuman(indexUpdate, namaBaru, hargaBaru);
                    break;

                case 4: // Hapus minuman
                    System.out.print("Masukkan index minuman yang ingin dihapus (1-" + manager.size + "): ");
                    int indexDelete = -1;

                    // Memastikan input indeks valid
                    while (true) {
                        try {
                            indexDelete = Integer.parseInt(scanner.nextLine()) - 1;
                            if (indexDelete >= 0 && indexDelete < manager.size) {
                                break;
                            } else {
                                System.out.println("Index tidak valid, pilih antara 1-" + manager.size + ".");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid, harap masukkan angka.");
                        }
                    }
                    manager.deleteMinuman(indexDelete);
                    break;

                case 5: // Keluar
                    System.out.println("Terima kasih, aplikasi selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
