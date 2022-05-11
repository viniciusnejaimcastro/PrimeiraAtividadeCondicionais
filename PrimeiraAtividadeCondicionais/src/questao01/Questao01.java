package questao01;
/**
 * 
 * Crie um programa que solicite ao usuario 2 valores inteiros e imprima o maior com o seguinte formato:
 * "o maior valor é: n"
 * Para finalizar, envie o seu codigo para o repositorio do github com o seguinte nome "PrimeiraAtividadeCondicional"
 * 
 */
import java.util.Scanner;


public class Questao01 {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int valor1,valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = ler.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = ler.nextInt();

        if(valor1 > valor2){
            System.out.println("O maior valor é: "+ valor1);
        } else if(valor1 < valor2){
            System.out.println("O maior valor é: "+ valor2);
        } else {
            System.out.println("Os valores sao iguais.");
        }

    }
}


