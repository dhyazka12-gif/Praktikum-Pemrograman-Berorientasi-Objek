/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author ASUS
 */
public class MainMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Merah");
        
        mobil1.startEngine();
        mobil2.startEngine();
        System.out.println();
        
        System.out.println("Informasi mobil 1: ");
        mobil1.displayInfo();
        
        System.out.println("Setelah ditambah perubahan: ");
        mobil1.setWarna("Putih");
        mobil1.displayInfo();
    }
}
