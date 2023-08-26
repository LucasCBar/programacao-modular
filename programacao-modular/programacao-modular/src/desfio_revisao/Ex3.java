/*
03 – Escreva um ou mais métodos para imprimir no 
console retângulos usando caracteres, como, por exemplo:

XXXXX
X   X
X   X
X   X 
XXXXX

*/

package desafio_revisao;

public class Ex3 {

	public static void main(String[] args) {
		retanguloCB();
		retanguloLD();
		retanguloLD();
		retanguloLD();
		retanguloCB();
	}
	
	public static void retanguloCB() {
		System.out.println("XXXXX");
	}
	
	public static void retanguloLD() {
		System.out.println("X   X");
	}

}
