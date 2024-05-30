/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tpmodul3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
/**
 *
 * @author arzaq
 */
public class LingkaranTest {

    @Test
    public void testWarna() {
        Lingkaran lingkaran = new Lingkaran("Merah", 5.0);
        assertEquals("Merah", lingkaran.warna); 
    }

    @Test
    public void testKeliling() {
        Lingkaran lingkaran = new Lingkaran("Biru", 3.0);
        // Menggunakan assertEquals dengan delta untuk perhitungan floating point
        assertEquals(18.84955592153876, lingkaran.getKeliling(), 0.0001); 
    }

    @Test
    public void testLuas() {
        Lingkaran lingkaran = new Lingkaran("Hijau", 7.0);
        assertEquals(153.93804002589985, lingkaran.getLuas(), 0.0001); 
    }

    @Test
    public void testPrintMethods() {
        // Redirect output ke ByteArrayOutputStream untuk testing
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
 
        Lingkaran lingkaran = new Lingkaran("Kuning", 2.0);
        lingkaran.printWarna_1302210096();
        lingkaran.printKeliling_1302210096();
        lingkaran.printLuas_1302210096();

        // Set locale to US to ensure consistent decimal separator for testing
        Locale.setDefault(Locale.US);

        String expectedOutput = "Warna objek lingkaran adalah Kuning\n" +
                                "Keliling objek lingkaran adalah: 12.566370614359172\n" +
                                "Luas objek lingkaran adalah: 12.566370614359172\n";

        assertEquals(expectedOutput, outContent.toString());

        // Reset System.out setelah selesai
        System.setOut(System.out);
    }
}
