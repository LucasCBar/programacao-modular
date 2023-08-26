/*
12 - Refaça o exercício 04, fazendo com que o programa leia de um arquivo 
todas as frases a serem impressas de forma invertida. A última linha deste 
arquivo terá a palavra “fim”.

*/ 


package desafio_revisao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex12 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("frases.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.equalsIgnoreCase("fim")) {
                    System.out.println("O programa foi encerrado.");
                    break;
                } else {
                    mostraFraseInvertida(linha);
                    System.out.println("");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostraFraseInvertida(String stringInvertida) {
        String invertida = inverterString(stringInvertida);
        System.out.println("Frase invertida: " + invertida);
    }

    public static String inverterString(String string) {
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }

        return reversed.toString();
    }
}




