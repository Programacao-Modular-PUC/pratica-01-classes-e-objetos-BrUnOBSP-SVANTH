/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;
import java.util.Calendar;
/**
 *
 * @author 1593111
 */
public class Pessoa {
 public String nome;
    public String sobrenome;
    public Data dataNascimento;
    public double altura;
    public double peso;
    public double IMC;
    
    
    public Pessoa(String nome,String sobrenome, Data dataNascimento, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
         
    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the IMC
     */
    public double getIMC() {
        return IMC;
    }
  public int calculaIdade(){
        Calendar hoje = Calendar.getInstance();
     
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        
        int idade = anoAtual - dataNascimento.getAno();
        
        if(mesAtual < dataNascimento.getMes()|| (mesAtual == dataNascimento.getMes() && diaAtual < dataNascimento.getDia())){
        idade--;    
        }
            return idade; }
  
public double calculaIMC(){
    IMC = peso / (altura*altura);
    return IMC;
}
public String informaObesidade(){
    
    double valorIMC = calculaIMC();
    
    if(valorIMC < 18.5){
        return "Abaixo do peso";
    }else if(valorIMC < 25 ){
        return "Peso normal";
    }else if(valorIMC < 30){
        return "Sobrepeso";
    }else if(valorIMC < 35){
        return "Obesidade grau 1";
    }else if(valorIMC < 40){
        return "Obesidade grau 2";
    }else{ return "Obesidade grau 3";
}
}
}   

