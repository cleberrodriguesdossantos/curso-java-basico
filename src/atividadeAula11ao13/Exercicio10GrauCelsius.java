package atividadeAula11ao13;

import java.util.Scanner;

/*Faça um Programa que peça a temperatura em graus Celsius,
 *  transforme e mostre em graus Farenheit. 
 */

public class Exercicio10GrauCelsius {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Informe a temperatura em grau Celsius: ");
		double celsius = leitor.nextDouble();
		
		double fahrenheit = (celsius*1.8)+32;
		
		System.out.println("A temperatura em Fahrenheit é : " +fahrenheit+"°F");
	}

}
