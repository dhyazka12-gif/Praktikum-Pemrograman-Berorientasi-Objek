/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
class KendaraanUtama {
    public String merk; // Tambahkan 'public' di sini
    
    public void infoKendaraan() {
        System.out.println("Merk Kendaraan: " + merk);
    }
}

class KendaraanDarat extends KendaraanUtama {
    public int jumlahRoda; // Tambahkan 'public' di sini juga
    
    public void infoDarat() {
        System.out.println("Jumlah Roda   : " + jumlahRoda);
    }
}

class MobilDarat extends KendaraanDarat {
    int kapasitasPenumpang;

    public void tampilkanDetailMobil() {
        System.out.println("=== Detail Mobil ===");
        infoKendaraan();
        infoDarat();
        System.out.println("Kapasitas     : " + kapasitasPenumpang + " orang");
    }
}

class MotorDarat extends KendaraanDarat {
    String tipeStarter;

    public void tampilkanDetailMotor() {
        System.out.println("=== Detail Sepeda Motor ===");
        infoKendaraan();
        infoDarat();
        System.out.println("Tipe Starter  : " + tipeStarter);
    }
}