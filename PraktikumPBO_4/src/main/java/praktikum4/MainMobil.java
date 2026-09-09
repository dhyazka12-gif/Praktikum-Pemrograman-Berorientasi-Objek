/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class MainMobil {
    public static void main(String[] args) {
        // Membuat objek dari class Mobil
        Mobil mobil1 = new Mobil("Toyota Avanza", 180, "Bensin", 4);

        // Menampilkan info lengkap dari class induk (Kendaraan)
        System.out.println("=== Informasi Kendaraan ===");
        mobil1.tampilkanInfoKendaraan();

        System.out.println("\n=== Informasi Tambahan Mobil ===");
        // Menampilkan info spesifik dari subclass (Mobil)
        mobil1.tampilkanInfoMobil();
    }
}
