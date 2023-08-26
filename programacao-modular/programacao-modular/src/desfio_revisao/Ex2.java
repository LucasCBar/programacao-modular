/*
02 - Escreva códigos Java que leiam um vetor de inteiros e criem outro vetor,
 contendo a soma de cada par de vizinhos do vetor original. Por exemplo, se o 
 vetor original era 4-8-15-16-23-42, o retorno deve ser um vetor 12-31-65 
 (ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último número 
 deve ser somado consigo mesmo. Para ler o vetor, pode aproveitar o método do 
 exercício 02. Escreva um programa que execute e teste seu código.. 
*/

package desafio_revisao;
import java.util.Scanner;

public class Ex2 {

public static void main(String[] args) {
	int[] vetor = geraVetor();
	
	System.out.print("Valores do vetor: ");
	mostraVetor(vetor);
	
	int[] vetorSomado = somarVetor(vetor);
	
	System.out.print("Valores do vetor somados: ");
	mostraVetor(vetorSomado);

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
	
public static int[] somarVetor(int[] vetor) {
	int[] vetSoma = new int[vetor.length / 2 + vetor.length % 2];
	
	for(int i=0; i<vetSoma.length ; i++) {
		 if (i * 2 + 1 < vetor.length) {
			 vetSoma[i] = vetor[i * 2] + vetor[i * 2 + 1];
			 
         } else {
        	 vetSoma[i] = vetor[i * 2];
         }
	}
 
	return vetSoma;
	
 }

public static void mostraVetor(int[] vetor) {

	System.out.print("[");
	for(int i=0; i<vetor.length; i++) {
		System.out.print(" " + vetor[i] + " ");
	}
	System.out.print("]");
	System.out.println("");

	
}

}
