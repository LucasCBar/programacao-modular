/*
 05 – Um estudante muito organizado está matriculado em N disciplinas, 
 e dispõe de um total semanal de H horas e M minutos para estudar. 
 Sua intenção é dividir o tempo disponível igualmente para as N disciplinas,
 e distribuir o tempo de descanso que sobrar nas pausas entre as disciplinas.
 Crie um ou mais métodos para informar ao estudante como ele deve organizar
 seu plano de estudos.
 */


package desafio_revisao;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5(); 

		ex5.planejamentoAluno();


	}
	
	public void planejamentoAluno() {
        Scanner scanner = new Scanner(System.in);
        
        double porcentagemDesc = 0;
        		
        System.out.print("Digite a quantidade de discplinas que o aluno possui: ");
        int numDisp = scanner.nextInt();
        
        System.out.print("Digite a quantidade de horas que o aluno prentende estudar: ");
        int horasEst = scanner.nextInt();
        
        if (numDisp > 1) {
        	System.out.print("Digite a porcentagem do descanso comparado com o tempo total de estudo: ");
        	porcentagemDesc = scanner.nextDouble();
        }
        
		Aluno aluno1 = new Aluno(numDisp, horasEst, porcentagemDesc);
		System.out.println("Tempo médio de estudo por matéria: " + aluno1.calcularTempoMedioPorMateria() + " minutos");
		System.out.println("E o tempo de intervalo entre os estudos é de: " + aluno1.calcularTempoDeDescanso() + " minutos");

        scanner.close();
	}

	public class Aluno {
	    private int numeroMaterias;
	    private int tempoEstudos;
	    private double porcentagemDescanso;

	    public Aluno(int numeroMaterias, int tempoEstudos, double porcentagemDescanso) {
	        this.numeroMaterias = numeroMaterias;
	        this.tempoEstudos = tempoEstudos;
	        this.porcentagemDescanso = porcentagemDescanso;
	    }

	    public int getNumeroMaterias() {
	        return numeroMaterias;
	    }

	    public void setNumeroMaterias(int numeroMaterias) {
	        this.numeroMaterias = numeroMaterias;
	    }

	    public int getTempoEstudos() {
	        return tempoEstudos;
	    }

	    public void setTempoEstudos(int tempoEstudos) {
	        this.tempoEstudos = tempoEstudos;
	    }
	    
	    public double getTempoDescanso() {
	        return porcentagemDescanso;
	    }

	    public void setPorcentagemDescanso(double porcentagemDescanso) {
	        this.porcentagemDescanso = porcentagemDescanso;
	    }
	    
	    public double calcularTempoDeDescanso() {
	    	double tempoDescanso = 0;
	    	
	    	if (porcentagemDescanso == 0) {
	    		tempoDescanso = 0;
	    	} else { 
	    		double aux = (porcentagemDescanso / 100);
	        	double aux2 = tempoEstudos * aux;

	    	     tempoDescanso = aux2 / (numeroMaterias - 1);
	    	}
	    
			return tempoDescanso * 60;

	    }	    
	    
	    public double calcularTempoMedioPorMateria() {
	        if (numeroMaterias == 0) {
	            return 0.0;
	        }	
	        	double tempoTotalAux = ((tempoEstudos / numeroMaterias) - (calcularTempoDeDescanso() / 60));    	
	        	double tempoTotal = tempoTotalAux;
	        
	        return (double) (tempoTotal * 60);
	    }

	}
	
}