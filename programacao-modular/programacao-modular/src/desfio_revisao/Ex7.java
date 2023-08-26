/*
07 - Um algoritmo para multiplicação rápida por 11 de números de 2 
dígitos funciona assim: para multiplicar 81 x 11, some os dígitos
do número (8 + 1 = 9) e insira o resultado entre os dígitos (891). 
Se a soma der maior que 9, incremente o dígito da esquerda 
(vai-um): 56 x 11 = 616. Escreva um programa que efetue multiplicações 
por 11 usando este algoritmo.*/

package desafio_revisao;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de dois dígitos: ");
        int numeroEntrada = scanner.nextInt();
        
        int resultado = multiplicarPor11(numeroEntrada);
        System.out.println("Resultado de " + numeroEntrada + " x 11 = " + resultado);
    }
    
    public static int multiplicarPor11(int numero) {
        int primeiroDigito = numero / 10;
        int segundoDigito = numero % 10;
        
        int dezenasNovas = (primeiroDigito + segundoDigito) % 10;
        int centenasNovas = primeiroDigito + (primeiroDigito + segundoDigito) / 10;
        
        int resultado = centenasNovas * 100 + dezenasNovas * 10 + segundoDigito;
        
        return resultado;
    }
}
