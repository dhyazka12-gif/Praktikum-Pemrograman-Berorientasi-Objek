/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : daftarProduk) {
            double hargaSetelahDiskon = p.getHarga() - p.hitungDiskon();
            total += hargaSetelahDiskon;
            System.out.println("- " + p.getNama() + " (Rp " + p.getHarga() + ") - Diskon: Rp " + p.hitungDiskon() + " = Rp " + hargaSetelahDiskon);
        }
        return total;
    }
}


