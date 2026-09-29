/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class Main6 {
   public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Membuat objek dari kelas turunan
        Produk buku = new Buku("Pemrograman Java", 100000);
        Produk hp = new Elektronik("Smartphone", 3000000);
        Produk jaket = new Pakaian("Jaket Hoodie", 150000);

        // Menambahkan ke keranjang belanja
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(jaket);

        System.out.println("Rincian Belanja:");
        double totalAkhir = keranjang.hitungTotalHargaSetelahDiskon();
        
        System.out.println("\nTotal Harga Setelah Diskon: Rp " + totalAkhir);
    }
} 

