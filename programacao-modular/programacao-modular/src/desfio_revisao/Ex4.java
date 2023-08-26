
/*
 04 - Elabore um programa que leia uma frase e mostre-a 
 invertida na tela. Após mostrar a primeira frase, o programa 
 deve ler e imprimir outra, assim fazendo até que o usuário digite
 a palavra “fim”.*/

package desafio_revisao;
import java.util.Scanner;

public class Ex4 {
    
	public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        String string = "";
        
        while (!string.equalsIgnoreCase("fim")) {
            
            System.out.println("Digite uma frase para ser invertida: ");
            System.out.println("Para encerrar digite 'fim'.");
            string = scanner.nextLine();
            
            mostraFraseInvertida(string);
            System.out.println("");
        } 
    }

	public static void mostraFraseInvertida(String stringInvertida) {
	    if (stringInvertida.equalsIgnoreCase("fim")) {
	        System.out.println("O programa foi encerrado.");
	    } else {
	        String Invertida = inverterString(stringInvertida);
	        System.out.println("Frase invertida: " + Invertida);
	    }
	}

    public static String inverterString(String string) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        
        return reversed.toString();
    }
}
    
