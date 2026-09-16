/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class MainKendaraan {
    public static void main(String[] args) {
        
        Mobil mobilKu = new Mobil();
        mobilKu.nama = "Toyota Avanza";
        mobilKu.kecepatan = 100;
        mobilKu.jumlahPintu = 4;
        mobilKu.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motorKu = new SepedaMotor();
        motorKu.nama = "Yamaha R15";
        motorKu.kecepatan = 120;
        motorKu.jenisMesin = "4-Tak";
        motorKu.tampilkanInfo();
    }
}
