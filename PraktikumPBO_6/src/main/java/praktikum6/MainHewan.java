/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class MainHewan {
    public static void main (String[]args) {
        Hewan hewan = new Kucing();
        hewan.bersuara(); //output: Maow
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); //memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2 );//memanggil metode makan() yang overloaded
        
        Anjing anjing = new Anjing();
        anjing.bersuara();//output Woof
        anjing.makan("daging, 3");//memanggil metode makan() yang overloaded pada kelas hewan
    }
}

