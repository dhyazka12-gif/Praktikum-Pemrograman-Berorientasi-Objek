/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author ASUS
 */
public class Produk {
    private String namaProduk; //menyimpan nama produk
    private double harga; //menyimpan harga
    
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;//this karena atribut kepemilikan dan tidak termasuk parameter
        this.harga = harga;
    }
    public String getNamaProduk() {//membaca nilai dari nama produk
        return namaProduk;//mengembalikan nilai
    }
    public void setNamaProduk(String namaProduk) {//untuk mengubah nilai yang memiliki atribut private
        this.namaProduk = namaProduk;
    } 
    public double getHarga() {//membaca nilai dari nama produk
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + (long) harga);//long supaya harga tampil full
    }
}
//membuat kelas turunan produk
class Elektronik extends Produk {//extends untuk mewarisi isi kelas induk
    private int garansi; //dalam tahun
    
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);//diambil dari superclass
        this.garansi = garansi;
    }
    public int getGaransi() {
        return garansi;
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    @Override//digunakan pada kelas turunan, menimpa metode dari kelas induk
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
//membuat kelas turunan makanan 
class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
          super(namaProduk, harga);
          this.tanggalKadaluarsa = tanggalKadaluarsa;

    }
    public String gettanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();//cetak nama dan harga dari kelas induk
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}