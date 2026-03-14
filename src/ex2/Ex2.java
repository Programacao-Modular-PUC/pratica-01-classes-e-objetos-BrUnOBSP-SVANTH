/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author vitor
 */
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Sobrenome: ");
        String sobrenome = sc.nextLine();
        
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        
       Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
       double IMC = pessoa.calculaIMC();
       
       System.out.println("\nResultado:");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("IMC: " + String.format("%.2f", IMC));
        System.out.println("Classificação: " + pessoa.informaObesidade());

        sc.close();
        
    }
    }
    

