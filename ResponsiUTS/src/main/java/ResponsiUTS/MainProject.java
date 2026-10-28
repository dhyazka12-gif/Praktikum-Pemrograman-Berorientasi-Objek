/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author ASUS
 */
public class MainProject {
    public static void main(String[] args) {//titik awal project berjalan
        //membuat output produk
        System.out.println("OUTPUT PRODUK:");
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);//ubah harga, new untuk membuat objek baru elektronik
        laptop.tampilkanInfo();//membaca harga
        
        //output pegawai
        System.out.println("\nOUTPUT PEGAWAI");
        PegawaiTetap hikaru = new PegawaiTetap("Hikaru", 5000000, 1000000);
        hikaru.tampilkanInfo();
        
        //output polimorfisme 
        System.out.println("\nOUTPUT POLIMORFISME");
        Produk produk1 = new Makanan("Snack", 1500, "2026-12-30");
        Produk produk2 = new Elektronik("Headphone", 800000, 1);
        Pegawai pegawai1 = new PegawaiKontrak("Aramsamsam", 3000000, 12);
        Pegawai pegawai2 = new PegawaiTetap("Klepon Hamzah", 6000000, 1500000);
        
        produk1.tampilkanInfo();
        System.out.println();//ditambahkan supaya output lebih rapih
        produk2.tampilkanInfo();
        System.out.println();
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
