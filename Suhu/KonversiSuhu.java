/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suhu;

/**
 *
 * @author LENOVO LOQ
 */
public class KonversiSuhu {
    
    // Method untuk konversi Celcius ke Fahrenheit
    public void celciusToFahrenheit(double celcius) {
        double hasil = (celcius * 9/5) + 32;
        System.out.println(celcius + " Celcius ke Fahrenheit: " + hasil);
    }

    // Method untuk konversi Celcius ke Reamur
    public void celciusToReamur(double celcius) {
        double hasil = celcius * 4/5;
        System.out.println(celcius + " Celcius ke Reamur: " + hasil);
    }
}
