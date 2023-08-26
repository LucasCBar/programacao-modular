/*
Refaça o exercício 08, adicionando a capacidade de ler várias datas de um arquivo texto. O arquivo conterá, em sua primeira linha, o número de datas das linhas seguintes. Por exemplo,
4
12/02/2013
14/11/2019
31/04/2020
26/01/2021

*/

package desafio_revisao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<String> datas = lerDatasDoArquivo("datas.txt");

        for (String data : datas) {
            String resultadoValidacao = validarData(data);
            System.out.println("Resultado da validação para " + data + ": " + resultadoValidacao);
        }
    }

    public static List<String> lerDatasDoArquivo(String nomeArquivo) {
        List<String> datas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            int numDatas = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numDatas; i++) {
                String data = reader.readLine();
                datas.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datas;
    }

    public static String validarData(String data) {
        String[] partes = data.split("/");
        
        if (partes.length != 3) {
            return "Data inválida: formato incorreto";
        }
        
        int dia, mes, ano;
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            return "Data inválida: formato numérico inválido";
        }
        
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return "Data inválida: valores fora do intervalo";
        }
        
        boolean ehValida = true;
        
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            ehValida = false;
        } else if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                if (dia > 29) {
                    ehValida = false;
                }
            } else {
                if (dia > 28) {
                    ehValida = false;
                }
            }
        }
        
        if (!ehValida) {
            return "Data inválida: dia inválido para o mês e ano";
        }
        
        return "Data válida";    }
}
