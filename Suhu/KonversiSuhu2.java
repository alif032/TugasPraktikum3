/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suhu;

/**
 *
 * @author LENOVO LOQ
 */
public class KonversiSuhu2 extends KonversiSuhu {
    
    // Method untuk konversi Fahrenheit ke Reamur
    public void fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;  // Konversi Fahrenheit ke Celcius
        double reamur = celcius * 4/5;             // Konversi Celcius ke Reamur
        System.out.println(fahrenheit + " Fahrenheit ke Reamur: " + reamur);
    } 
}
