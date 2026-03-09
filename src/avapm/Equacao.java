/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avapm;
/**
 *
 * @author 1593111
 */
public class Equacao {
 public double c1;
 public double c2;
 public double h;
 
    
public Equacao(double c1, double c2){
    this.c1 = c1;
    this.c2 = c2;
    
}
public double CalculaHipotenusa(){
   h = Math.sqrt(Math.pow(c1,2) + Math.pow(c2, 2));
   return h;
}
public double CalculaArea(){
    return(c1*c2)/2;
}
}