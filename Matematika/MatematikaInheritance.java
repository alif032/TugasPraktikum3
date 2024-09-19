/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author LENOVO LOQ
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
       Matematika mtk1 = new Matematika();       
       Matematika2 mtk2 = new Matematika2();
       
       mtk1.pertambahan(20, 10);
       mtk1.pengurangan(10, 5);
       mtk1.perkalian(10, 3);
       mtk1.pembagian(21, 2);
       mtk1.modulus(10, 3);
       
       System.out.println();
       
       mtk2.pertambahan(20, 10);
       mtk2.pengurangan(10, 5);
       mtk2.perkalian(10, 3);
       mtk2.pembagian(21, 2);
       mtk2.modulus(10, 3);
    }
}
