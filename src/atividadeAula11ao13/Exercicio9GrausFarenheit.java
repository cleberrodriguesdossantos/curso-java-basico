package atividadeAula11ao13;
/*
 * Faça um Programa que peça a temperatura em graus Farenheit,
 *  transforme e mostre a temperatura em 
 *  graus Celsius. o C = (5 * (F-32) / 9)*/

import java.util.Scanner;

public class Exercicio9GrausFarenheit {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" informe a temperatura em graus Fahrenheit: ");
		double fahrenheit = leitor.nextDouble();
		
		double celsius = (5*(fahrenheit - 32)/9);
		
		System.out.printf("a temperatura informada, transformada em graus Celsius é: %.2f ",celsius);
		System.out.println("°C");

	}

}
