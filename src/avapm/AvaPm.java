/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avapm;
import java.util.Scanner;

    
 /**
 *
 * @author 1593111
 */
public class AvaPm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do cateto 1: ");
       double c1 = sc.nextDouble();
       
       System.out.println("Digite o valor do cateto 2: ");
       double c2 = sc.nextDouble();
       
       Equacao triangulo = new Equacao(c1, c2);
       
       double hipotenusa = triangulo.CalculaHipotenusa();
       double area = triangulo.CalculaArea();
       
       System.out.println("Hipotenusa; " + hipotenusa);
       System.out.println("Area do triangulo; " + area);
       
       sc.close();
    }
    
}
