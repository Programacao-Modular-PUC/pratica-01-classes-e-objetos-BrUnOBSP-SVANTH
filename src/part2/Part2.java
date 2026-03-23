/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2;

/**
 *
 * @author 1593111
 */
import java.util.Scanner;
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        Pessoa[] pessoa = new Pessoa[10];
        
        int contador = 0;
        for(int i=0; i<0; i++){
            System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Sobrenome: ");
        String sobrenome = sc.nextLine();
        
        if(i>0){
            String atual = nome + sobrenome;
            String anterior = pessoa[i-1].getNome() + pessoa[i-1].getSobrenome();
            if(atual.equalsIgnoreCase(anterior)){
                break;
            }
        }
        System.out.println("Data de nascimento: ");
        int dia = sc.nextInt();
        
        System.out.println("Mes de nascimento: ");
        int mes = sc.nextInt();
        
        System.out.println("Ano de nascimento: ");
        int ano = sc.nextInt();
        
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        
        Data data = new Data(dia, mes, ano);
        pessoa[i] = new Pessoa(nome, sobrenome, data, altura, peso);
        
        contador++;
        }
        System.out.println("\n--------- RESULTADO -------");
        
        for(int i = 0; i<contador; i++){
            
            Pessoa p = pessoa[i];
            
            System.out.println("\nCadastro " + (i+1));
            System.out.println("Nome completo: " + p.getNome() + p.getSobrenome());
            System.out.println("Idade: " + p.calculaIdade());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("IMC: " + String.format("%.2f", p.calculaIMC()) );
            System.out.println("Classificacao: " + p.informaObesidade());
        }
       
       
     

        sc.close();
    }
    
}
