/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    public static void main(String[] args) {
        System.out.println("========== PENGUJIAN KELAS HEWAN ==========");
        
        Kucing kucingku = new Kucing();
        kucingku.nama = "Ajik";
        kucingku.jenis = "Persia";
        kucingku.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjingku = new Anjing();
        anjingku.nama = "Pawpatrol";
        anjingku.jenis = "Kintamani";
        anjingku.tampilkanInfo();
        
        System.out.println("\n========== PENGUJIAN HIRARKI KENDARAAN (3 LEVEL) ==========");
        
        MobilDarat mobilKu = new MobilDarat(); // Menggunakan MobilDarat
        mobilKu.merk = "Toyota Avanza";
        mobilKu.jumlahRoda = 4;
        mobilKu.kapasitasPenumpang = 7;
        mobilKu.tampilkanDetailMobil();
        
        System.out.println();
        
        MotorDarat motorKu = new MotorDarat(); // Menggunakan MotorDarat
        motorKu.merk = "Honda Beat";
        motorKu.jumlahRoda = 2;
        motorKu.tipeStarter = "Electric & Kick Starter";
        motorKu.tampilkanDetailMotor();
    }
}
