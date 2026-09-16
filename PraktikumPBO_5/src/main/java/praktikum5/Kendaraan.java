/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.print("Nama Kendaraan: " + nama);
        System.out.print("Kecepatan: " + kecepatan + "km/jam");
    }
}
//class turunan Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
         System.out.print("INFORMASI MOBIL");
         System.out.print("Nama Kendaraan: " + nama);
         System.out.print("Kecepatan: " + kecepatan + "km/jam");
         System.out.print("Jumlah Pintu: " + jumlahPintu);
    }
}
// Kelas Turunan: SepedaMotor (Mengikuti 5.4.2 poin 4 & 5.4.3 poin 2)
class SepedaMotor extends Kendaraan {
    String jenisMesin;

    @Override 
    public void tampilkanInfo() {
        System.out.println("INFORMASI SEPEDA MOTOR");
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}