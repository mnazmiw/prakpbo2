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
public class hitung {
    /*Atribut*/
    int butuh;
    int ukuran;
    int isi;
    int harga;
    
    /*Constructor*/
    hitung(int b, int u, int i, int h) {
        this.butuh = b;
        this.ukuran = u;
        this.isi = i;
        this.harga = h;
    }
    
    double butuhCm() { /*Untuk mengkonversi luas kebutuhan dari m2 ke cm2*/
        return this.butuh * 10000;
    } 
    
    double luasCm() { /*Untuk menghitung luas keramik per box*/
        return this.ukuran * this.isi;
    }
    
    double total() { /*Untuk menghitung total kebutuhan box keramik*/
        return butuhCm() / luasCm();
    }
    
    void totalHarga() { /*Untuk menghitung serta mengirim output total harga keramik merek tersebut. Total kebutuhan box dibulatkan karena tidak mungkin beli kurang dari 1 box*/
        System.out.println("Harga keramik = "+ this.harga * Math.ceil(total()));
    }
}
