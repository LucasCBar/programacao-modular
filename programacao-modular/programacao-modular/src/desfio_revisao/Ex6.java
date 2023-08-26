/*
06 – Mensalmente, a organização de moradores do bairro faz um sorteio
 cujos bilhetes contêm números de 6 dígitos. O sorteio é baseado nos 
 dois primeiros números da loteria federal, sendo que o número vencedor 
 no sorteio da organização é formado pelos três primeiros dígitos do segundo
 prêmio e os três últimos dígitos do primeiro prêmio da loteria federal.
 Por exemplo, se o primeiro prêmio fosse 34.582 e o segundo 54.098, o 
 número vencedor seria 540.582. Escreva um programa que leia os prêmios da 
 loteria federal e retorna o número vencedor da organização.*/

package desafio_revisao;
import java.util.Scanner;

public class Ex6 {    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.print("Digite o número do primeiro prêmio da loteria federal (6 dígitos): ");
	    int premio1 = scanner.nextInt();
	
	    System.out.print("Digite o número do segundo prêmio da loteria federal (6 dígitos): ");
	    int premio2 = scanner.nextInt();
	
	    int tresUltimosDigitosPremio1 = premio1 % 1000; 
	    int tresPrimeirosDigitosPremio2 = premio2 / 100;  
	
	    int numeroVencedor = tresPrimeirosDigitosPremio2 * 1000 + tresUltimosDigitosPremio1;
	
	    System.out.println("O número vencedor da organização é: " + tresPrimeirosDigitosPremio2 + String.format(".%03d", tresUltimosDigitosPremio1));
	}
}