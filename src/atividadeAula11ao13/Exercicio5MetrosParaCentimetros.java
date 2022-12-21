package atividadeAula11ao13;

/*Faça um Programa que converta metros para centímetros
 * 
 */

import java.util.Scanner;

public class Exercicio5MetrosParaCentimetros {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println(" informe quantos metros : ");
	Double metros = leitor.nextDouble();
	
	Double centimetros = metros*100;
	
	System.out.println("O valor da metragem digitado é de : " + metros);
	System.out.println(" Converdito em centimetros é : " + centimetros);

	}

}
