package atividadeAula11ao13;

/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 * 
 */

import java.util.Scanner;

public class Exercicio6RaiodeUmCirculo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo : ");
		float raio = leitor.nextFloat();
		
		float elevado = (float) Math.pow(raio, 2);
		float pi = (float) 3.14;
		float area = pi * elevado ;
		
		System.out.println(" A área é de : " + area);

	}

}
