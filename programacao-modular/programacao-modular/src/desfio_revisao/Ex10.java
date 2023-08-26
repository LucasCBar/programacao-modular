/*
10 - Refaça o exercício 02, sendo que os dados serão lidos de um arquivo texto. 
O arquivo texto pode ter várias linhas e cada linha representa um vetor a ser 
utilizado pelo método. O separador usado é ponto e vírgula. Por exemplo:
4;8;15;4;15;16;23;42
7;11;13;17;29;23;29;31
6;5;4;3;2;1

*/

package desafio_revisao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<int[]> vetores = lerVetoresDoArquivo("dados.txt");
        
        for (int[] vetor : vetores) {
            System.out.print("Valores do vetor: ");
            mostraVetor(vetor);

            int[] vetorSomado = somarVetor(vetor);

            System.out.print("Valores do vetor somados: ");
            mostraVetor(vetorSomado);
        }
    }

    public static List<int[]> lerVetoresDoArquivo(String nomeArquivo) {
        List<int[]> vetores = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(";");
                int[] vetor = new int[valores.length];

                for (int i = 0; i < valores.length; i++) {
                    vetor[i] = Integer.parseInt(valores[i]);
                }

                vetores.add(vetor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return vetores;
    }

    public static int[] somarVetor(int[] vetor) {
        int[] vetSoma = new int[vetor.length / 2 + vetor.length % 2];

        for (int i = 0; i < vetSoma.length; i++) {
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
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }
}
