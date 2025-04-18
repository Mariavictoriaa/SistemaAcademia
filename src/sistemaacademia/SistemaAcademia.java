/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

import java.util.ArrayList;
import java.util.Scanner;
import model.AlunoAcademia;

/**
 *
 * @author Instrutor
 */
public class SistemaAcademia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<AlunoAcademia> alunos = new ArrayList<>();
        int opcao;
        
        do {
           System.out.println("\n=== Menu da Academia ===");   
           System.out.println("1. Cadastrar Aluno");      
           System.out.println("2. Lista de Aluno e IMC");      
           System.out.println("3. sair");  
           System.out.println("Escola uma opção");
           
           opcao = scanner.nextInt();
           scanner.nextLine();

           switch (opcao) {
               case 1:
                  System.out.println("nome: ");
                  String nome = scanner.nextLine();
                  
                  //System.out.println("idade: ");
                  //int idade = scanner.nextLine();
                  
                  System.out.println("peso: ");
                  double peso = scanner.nextDouble();
                  
                  System.out.println("altura: ");
                  double altura= scanner.nextDouble();
          
                 
                  alunos.add(new AlunoAcademia(nome, peso, altura));                  
                  break;
                  
                  
               case 2 :
                  if (AlunoAcademia.isEmpty(){
                      System.out.println("nenhum aluno cadastrado");
                  }else {    
                      System.out.println("\n --- Lista de alunos ---");
                      
                      for(AlunoAcademia aluno : Alunos) {  
                          System.out.println(aluno);
                      }
                  }
                   break;
                                  
                            
                   case 3 : 
                       System.out.println("saindo do sistema...");  
                       break;
                          
                         
               default:
                   System.out.println("opção invalida");
           
           
            }
        }while (opcao != 3)
            
            
        }
    Scanner.closer();
}
        
                   
                   
                   
                   
                   
      //AlunoAcademia aluno = new AlunoAcademia("Pedro", 85.5,1.75);    
     // AlunoAcademia aluno1 = new AlunoAcademia("Maria", 74.1,1.88);
      //AlunoAcademia aluno2 = new AlunoAcademia("José", 120.5,1.75);
      
       //aluno1.exibirStatus();
       //aluno2.exibirStatus();
               
               
               
               
               
               
             



            
      