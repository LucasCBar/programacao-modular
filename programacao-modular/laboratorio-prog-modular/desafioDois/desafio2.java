package desafioDois;
import java.util.Scanner;
public class desafio2 {	






	

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        aplicacaoMenu();
	    
	}
	public static void aplicacaoMenu() {
	       Scanner leitor = new Scanner(System.in);

	        boolean continuar = true;
	        System.out.print("Digite uma data de entrada no formato DD/MM/AAAA: ");
            String dataEntrada = leitor.nextLine();
            Data.dataResultado(dataEntrada);

            Data dataUtil = new Data(dataEntrada);
	        

	        while (continuar) {
	            System.out.println("");
	            System.out.println("Escolha uma opção:");
	            System.out.println("1. Validar uma data qualquer");
	            System.out.println("2. Alterar valor da data");
	            System.out.println("3. Comparar datas");
	            System.out.println("4. Mostrar dia da semana em 2024");
	            System.out.println("5. Alterar valor da segunda data");
	            System.out.println("6. Visulizar alguma data");
	            System.out.println("0. Sair");
	            System.out.print("Escolha: ");

	            int opcao = leitor.nextInt();
	            leitor.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

	            switch (opcao) {
	                case 1:
	                	System.out.print("Digite uma data qualquer no formato DD/MM/AAAA: ");
	                    String dataQualquer = leitor.nextLine();
	                    String resultado = Data.validarData(dataQualquer) ? "válida" : "inválida";
	                    System.out.println("A data é " + resultado + ".");
	                    break;
	                    
	                case 2:
	                	System.out.print("Digite uma nova data de entrada no formato DD/MM/AAAA: ");
	                	String novaData = leitor.nextLine();
	                	
	                	dataEntrada = novaData;

	                	dataUtil.setData(dataEntrada);
	                	System.out.println("A nova data é: " + Data.mostrarDatas(dataEntrada));
	                	
	                    break;
	                    
	                case 3:
	                	Data.compararData(dataEntrada);
	                    break;
	                    
	                case 4:
	                	Data.calcularDiaDaSemana(dataEntrada);
	                   
	                    break;
	                    
	                case 5:
	                	Data.alterarSegundaData();
	                   
	                    break;
	                    
	                case 6:
	                	System.out.println("Primeira data: " + Data.dataResultado(dataEntrada));
	                	System.out.println("Segunda data: " + Data.definirSegundaData());
	                	
	                    break;
	                  
	                case 0:
	                    continuar = false;
	                    System.out.println("Saindo da aplicação.");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }
	    }
	}
	
	
	

