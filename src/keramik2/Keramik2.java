/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik2;

/**
 *
 * @author azmig
 */
public class Keramik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Inisiasi*/
        /* hitung(kebutuhan, ukuran, isi, harga) */
        hitung A = new hitung(100, 30*30, 10, 54000);
        A.totalHarga();
        
        hitung B = new hitung(100, 40*40, 5, 65000);
        B.totalHarga();
        
        hitung C = new hitung(100, 30*40, 8, 60000);
        C.totalHarga();
    }
    
}
