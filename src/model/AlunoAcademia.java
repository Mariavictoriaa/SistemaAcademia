/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Instrutor
 */
public class AlunoAcademia {
    String nomeAluno;
    double pesoAluno;
    double alturaAluno;

    public AlunoAcademia(String nomeAluno, double pesoAluno, double alturaAluno) {
        this.nomeAluno = nomeAluno;
        this.pesoAluno = pesoAluno;
        this.alturaAluno = alturaAluno;
    }


    public double calculaIMC() {
        return pesoAluno / (alturaAluno * alturaAluno);

    }

    public void exibirStatus() {
        double imc = calculaIMC();
        System.out.println("Nome: " + nomeAluno);
        System.out.println("imc: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("sobrepeso");
        } else
            System.out.println("obesidade");

    }

}
          

       



