/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suhu;

/**
 *
 * @author LENOVO LOQ
 */
public class DemoKonversiSuhu { 
     public static void main(String[] args) {
        KonversiSuhu konversi1 = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        double celcius = 30.0;
        double fahrenheit = 86.0;
        
        konversi1.celciusToFahrenheit(celcius);
        konversi1.celciusToReamur(celcius);
        konversi2.fahrenheitToReamur(fahrenheit);
    }
}
