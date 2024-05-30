/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmodul3;

/**
 *
 * @author Ibrahim
 */
import java.util.Scanner;
class Lingkaran{
    String warna;
    double jariJari;
    
    public Lingkaran(String warna, double r){
        this.warna = warna;
        this.jariJari = r;
    }
    
    public void printWarna_1302210022(){
        System.out.println("Warna objek lingkaran adalah" + warna);
    }
    
    public void printKeliling_1302210022(){
        double keliling = 2 * 22/7 * jariJari;
        System.out.println("Keliling objek lingkaran adalah:" + keliling);
    }
    
    public void printLuas_1302210022(){
        double Luas = 22/7 * jariJari * jariJari;
        System.out.println("Luas objek lingkaran adalah:" + Luas);
    }
}

public class main_1302210022{
    public static void main(String[] arguments){
        Scanner write = new Scanner(system.in);
        
        System.out.println("Masukan warna lingkaran: ");
        String warna = write.nextLine();
        
        System.out.println("Masukan jari-jari lingkaran: ");
        double r = write.nextDouble();
        
        Lingkaran L = new Lingkaran(warna, r);
        
        L.printWarna_1302210022();
        L.printKeliling_1302210022();
        L.printLuas_1302210022();
        
    }
}