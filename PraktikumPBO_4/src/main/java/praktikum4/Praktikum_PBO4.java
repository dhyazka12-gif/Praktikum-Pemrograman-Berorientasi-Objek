/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Praktikum_PBO4 {
    
    public static void main(String[] args) {
        // Membuat objek Kendaraan(nama, kecepatanMaks, jenisMesin)
        Kendaraan mobil = new Kendaraan("Toyota", 180, "Bensin");
        
        // Menampilkan informasi awal
        mobil.tampilkanInfoKendaraan();
        
        System.out.println("---------------------------");
        
        // Mengubah nama menggunakan setter
        mobil.setNama("Honda");
        
        // Mengakses jenisMesin langsung (karena public di modul)
        mobil.jenisMesin = "Diesel";
        
        // Menampilkan hasil setelah diubah
        System.out.println("Nama baru: " + mobil.getNama());
        System.out.println("Jenis mesin baru: " + mobil.jenisMesin);
    }
}
