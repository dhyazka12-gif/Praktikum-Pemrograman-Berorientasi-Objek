/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
    }
}

class Kucing extends Hewan {
    
    @Override
    public void tampilkanInfo() {
        System.out.println("INFORMASI KUCING");
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: Miaw");
    }
}

class Anjing extends Hewan {
    
    @Override
    public void tampilkanInfo() { 
        System.out.println("--- Informasi Anjing ---");
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
        System.out.println("Suara      : Guk-guk!");
    }
}
