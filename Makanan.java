/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul9;

/**
 *
 * @author Lenovo
 */
public class Makanan implements Pembayaran{

    @Override
    public double hitungPajak(double harga) {
        return harga + harga * 5/100;
    }

    @Override
    public double hargaAsli(double harga) {
        return harga;
    }
    
}
