/*
09 - Sabendo que 1o de janeiro de 2024 será uma segunda feira, 
escreva um método que receba uma data e diga em qual dia da semana 
esta data acontecerá em 2024. Escreva um programa principal 
para testar seu método.*/

package desafio_revisao;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato DD/MM: ");
        String entradaData = scanner.nextLine();
        
        String[] partesData = entradaData.split("/");
        
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        
        String diaDaSemana = calcularDiaDaSemana(dia, mes);
        System.out.println("No ano de 2024, na data " + entradaData + ", será um(a) " + diaDaSemana);
    }
    
    public static String calcularDiaDaSemana(int dia, int mes) {
        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        
        int diasDesde1Jan = dia - 1;
        switch (mes) {
            case 2:
                diasDesde1Jan += 31;
                break;
            case 3:
                diasDesde1Jan += 60;
                break;
            case 4:
                diasDesde1Jan += 91;
                break;
            case 5:
                diasDesde1Jan += 121;
                break;
            case 6:
                diasDesde1Jan += 152;
                break;
            case 7:
                diasDesde1Jan += 182;
                break;
            case 8:
                diasDesde1Jan += 213;
                break;
            case 9:
                diasDesde1Jan += 244;
                break;
            case 10:
                diasDesde1Jan += 274;
                break;
            case 11:
                diasDesde1Jan += 305;
                break;
            case 12:
                diasDesde1Jan += 335;
                break;
        }
        
        int indiceDiaDaSemana = (diasDesde1Jan + 1) % 7;  
        return diasDaSemana[indiceDiaDaSemana];
    }
}

