/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class MainTugasPBO4 {
    public static void main(String[] args) {
        // 1. Membuat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Budi", 30, "Software Engineer", 10000000);

        // 2. Menampilkan informasi pekerja menggunakan toString()
        System.out.println("Informasi Pekerja Awal");
        System.out.println(pekerja1.toString());

        pekerja1.setNama("Budi Santoso");
        System.out.println("Informasi Setelah Nama Diubah");
        System.out.println(pekerja1.toString());

        System.out.println("Uji atribut");
        
        System.out.println("Pekerjaan: " + pekerja1.pekerjaan); 
        
        System.out.println("Usia: " + pekerja1.usia); 
    }
}
