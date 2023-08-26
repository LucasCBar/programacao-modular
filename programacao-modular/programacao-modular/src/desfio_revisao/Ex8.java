package desafio_revisao;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato DD/MM/AAAA: ");
        String dataEntrada = leitor.nextLine();
        
        String resultadoValidacao = validarData(dataEntrada);
        System.out.println("Resultado da validação: " + resultadoValidacao);
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
        
        return "Data válida";
    }
}
