/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmodul3;

/**
 *
 * @author Ibrahim
 */
import java.util.Scanner;
class Lingkaran {
    String warna;
    double jariJari;
    
    public Lingkaran(String warna, double r){
        this.warna = warna;
        this.jariJari = r;
    }
    
    public void printWarna_1302210096(){
        System.out.println("Warna objek lingkaran adalah " + warna);
    }
    
    public double getKeliling() {
        return 2 * Math.PI * jariJari; // Using Math.PI for more accurate calculation
    }
    
    public void printKeliling_1302210096(){
        System.out.println("Keliling objek lingkaran adalah: " + getKeliling());
    }
    
    public double getLuas() {
        return Math.PI * jariJari * jariJari; // Using Math.PI for more accurate calculation
    }
    
    public void printLuas_1302210096(){
        System.out.println("Luas objek lingkaran adalah: " + getLuas());
    }
}

public class main_1302210096{
    public static void main(String[] arguments){
        Scanner write = new Scanner(System.in);
        
        System.out.println("Masukan warna lingkaran: ");
        String warna = write.nextLine();
        
        System.out.println("Masukan jari-jari lingkaran: ");
        double r = write.nextDouble();
        
        Lingkaran L = new Lingkaran(warna, r);
        
        L.printWarna_1302210096();
        L.printKeliling_1302210096();
        L.printLuas_1302210096();
    }
}
