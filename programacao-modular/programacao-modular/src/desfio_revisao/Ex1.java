/*
 01 - Escreva códigos Java para preencher um vetor de 6 números inteiros a partir da
  entrada do usuário e, depois, inverter as posições dos números do vetor. Por exemplo,
  se o vetor original era 4-8-15-16-23-42, deve ficar 42-23-16-15-8-4 após a execução. 
  Escreva um programa que verifique a correção do seu código..
*/

package desafio_revisao;
import java.util.Scanner;
import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {

		int[] vetor = geraVetor();
		
		System.out.print("Valores do vetor: ");
		mostraVetor(vetor);
		 
		int[] vetorInvertido = inverterVetor(vetor);
		
		System.out.print("Valores do vetor invertido: ");
		mostraVetor(vetorInvertido);
		
	}
	
	public static int[] geraVetor(){
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o tamanho do vetor: ");
		int tamanho = scanner.nextInt();
		int[] vetor = new int[tamanho];
		
        System.out.println("Digite os valores do vetor:");
        for(int i=0; i<tamanho ; i++) {
        	System.out.print("Valor " + (i + 1) + ": ");
        	vetor[i] = scanner.nextInt();
        }
		
		return vetor; 
	}
	
	public static void mostraVetor(int[] vetor) {

		System.out.print("[");
		for(int i=0; i<vetor.length; i++) {
			System.out.print(" " + vetor[i] + " ");
		}
		System.out.print("]");
		System.out.println("");

		
	}
	
	public static int[] inverterVetor(int[] vetor) {

		Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < vetor.length; i++) {
            pilha.push(vetor[i]);
        }
        
        for (int i = 0; i < vetor.length; i++) {
        	vetor[i] = pilha.pop();
        }

        return vetor;
	}

}

