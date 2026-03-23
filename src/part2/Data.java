/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;

/**
 *
 * @author 1593111
 */
public class Data {
    public int dia;
    public int mes;
    public int ano;
    
    public Data(int dia, int ano, int mes){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
}
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
}
