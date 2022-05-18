/**
 * Crie um programa chamado Questao02 que solicite ao usuario dois numeros entre 1 e 6
 * e some esses dois valores, posteriormente imprima a probabilidade do usuario
 * vencer um jogo de dados com os numeros selecionados.
 * 
 * Posteriormente envie seu codigo para o github na pasta questao02
 * 
 */
package questao02;

import java.util.Scanner;

public class Questao02 {
    
    // Objeto Scanner
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaracao de variaveis
        double primeiroValor, segundoValor, probabilidadeVitoria, somaValores;

        // Entrada de dados
        System.out.format("%nDigite um valor de 1 a 6: ");
        primeiroValor = ler.nextDouble();
        System.out.format("%nDigite um valor de 1 a 6: ");
        segundoValor = ler.nextDouble();

        somaValores = primeiroValor + segundoValor;

        // Condicoes para calculo da probabilidade de vitoria
        if (somaValores > 7) {
            probabilidadeVitoria = (13 - somaValores) / 6;
        } else {
            probabilidadeVitoria = (somaValores - 1) / 6;
        }

        // Condicoes de vitoria
        if (probabilidadeVitoria == 1.0/6.0) {
            System.out.format("%nProbabilidade de vitoria com os valores: %.2f + %.2f = %.2f%% %n", primeiroValor, segundoValor, probabilidadeVitoria * 100);
        }
         else if (probabilidadeVitoria == 2.0/6.0){
            System.out.format("%nProbabilidade de vitoria com os valores: %.2f + %.2f = %.2f%% %n", primeiroValor, segundoValor, probabilidadeVitoria * 100);
        }
         else if (probabilidadeVitoria == 3.0/6.0){
            System.out.format("%nProbabilidade de vitoria com os valores: %.2f + %.2f = %.2f%% %n", primeiroValor, segundoValor, probabilidadeVitoria * 100);
        } 
         else if (probabilidadeVitoria == 4.0/6.0){
            System.out.format("%nProbabilidade de vitoria com os valores: %.2f + %.2f = %.2f%% %n", primeiroValor, segundoValor, probabilidadeVitoria * 100);
        } 
         else if (probabilidadeVitoria == 5.0/6.0){
            System.out.format("%nProbabilidade de vitoria com os valores: %.2f + %.2f = %.2f%% %n", primeiroValor, segundoValor, probabilidadeVitoria * 100);
        } 
         else if (probabilidadeVitoria == 6.0/6.0){
            System.out.format("%nProbabilidade de vitoria com os valores: %.2f + %.2f = %.2f%% %n", primeiroValor, segundoValor, probabilidadeVitoria * 100);
        } 
         else {
            System.out.println("%nValor invalido!%n");
        }
        

    }
};
