/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul9;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main (String[] args){
        Pembayaran pe = new Elektronik();
        System.out.println("Harga asli barang elektronik :" + pe.hargaAsli(500000));
        System.out.println("Harga barang elektronik setelah pajak :" + pe.hitungPajak(500000));
        
        Pembayaran pm = new Makanan();
        System.out.println("Harga Makanan :" + pm.hargaAsli(75000));
        System.out.println("Harga makanan setelah pajak :" + pm.hitungPajak(75000));
        
    }
    
}
