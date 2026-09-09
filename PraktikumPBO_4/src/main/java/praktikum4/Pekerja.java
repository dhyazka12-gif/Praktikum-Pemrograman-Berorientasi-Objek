/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    // Atribut tambahan khusus Pekerja (private)
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor dari class Manusia
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan informasi pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() + 
               "\nUsia: " + usia + 
               "\nPekerjaan: " + pekerjaan + 
               "\nGaji: Rp" + gaji;
    }
}
   
