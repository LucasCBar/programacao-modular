package desafioDois;
import java.util.Scanner;

public class Data {
	private static Scanner scanner = new Scanner(System.in);
    private String data;
    private static String segundaData = null;
    
    public Data(String data) {
        this.data = data;
    }




	
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
    	this.data = data;
    }
    
    
    public static String mostrarDatas(String data) {
    	System.out.println(dataResultado(data));
    	return dataResultado(data);
    }
    
    //Metodo para validar uma data
	public static boolean validarData(String data) {
        String[] partes = data.split("/");
        
        if (partes.length != 3) {
            return false;
        }
        
        int dia, mes, ano;
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
        	 return false;
        }
        
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
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
            return false;
        }
        
        return true;
    }
	
	//Metodo retorna a data validada
	public static String dataResultado(String data) {
		
		boolean resultado = validarData(data);
	
		if(resultado == false) {
		    System.out.println("A data digitada, é invalida!");
		    System.out.println("Logo a data foi alterada para: 01/01/1900");
		    
		    data = "01/01/1900";
		    
			return data;
		} else {
			return data;
		}
		
	}
	
	//Metodo para separar dia, mes e ano de uma data
	private static int[] separarDiaEMes(String data) {	
		String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        int[] resultado = {dia, mes, ano};
        
        return resultado;
	}
	
	//Recebe uma data e mostra qual dia da semana vai ser em 2024
	public static String calcularDiaDaSemana(String data) {		 
        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        
        int[] diaEmes = separarDiaEMes(data);
        
        int diasDesde1Jan = diaEmes[0] - 1;
        switch (diaEmes[1]) {
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
        System.out.println("No ano de 2024, na data: " + diaEmes[0] + "/" + diaEmes[1] +" , será um(a) " + diasDaSemana[indiceDiaDaSemana]);
        return diasDaSemana[indiceDiaDaSemana];
    }
	
	//Atribui um valor a segunda data
	public static String definirSegundaData(){
        if (segundaData == null) {
            System.out.print("Digite uma segunda data no formato DD/MM/AAAA: ");
            segundaData = scanner.nextLine();
            
            String aux = dataResultado(segundaData);
            segundaData = aux;
            
            return segundaData;
        }
        
        return segundaData;
    }
   
	//Altera o valor da segunda data
    public static void alterarSegundaData() {
        System.out.print("Digite uma nova data para a segunda data no formato DD/MM/AAAA: ");
        segundaData = scanner.nextLine();
        
        String aux = dataResultado(segundaData);
        segundaData = aux;
    }
	
    // Pega a data de entrada e compara com uma segunda data
	public static boolean compararData(String data) {
        
        int[] data1 = separarDiaEMes(data);
        int[] data2 = separarDiaEMes(definirSegundaData());
        
        if(data1[2] < data2[2]) {
            System.out.println("A data: "+ data + " não está na frente da data: " + segundaData);
            return false;
        } else if (data1[2] == data2[2] && data1[1] < data2[1]) {
            System.out.println("A data: "+ data + " não está na frente da data: " + segundaData);
            return false;
        } else if (data1[2] == data2[2] && data1[1] == data2[1] && data1[0] < data2[0]) {
            System.out.println("A data: "+ data + " não está na frente da data: " + segundaData);
            return false;
        }
        System.out.println("A data: "+ data + " está na frente da data: " + segundaData);
		return true;
	}

}
