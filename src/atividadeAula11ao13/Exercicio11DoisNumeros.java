package atividadeAula11ao13;

import java.util.Scanner;

/* Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo .
 * b. a soma do triplo do primeiro com o terceiro. 
 * c. o terceiro elevado ao cubo.
 */

public class Exercicio11DoisNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Informe um numero inteiro(sem virgula ou ponto): ");
		int primeiroInt = leitor.nextInt();
		
		System.out.println(" Informe o segundo numero inteiro(sem virgula ou ponto):");
		int segundoInt = leitor.nextInt();
		
		System.out.println(" Informeo terceiro numero(com virgula):");
		double terceiroComPonto = leitor.nextDouble();
		
		// o produto do dobro do primeiro com metade do segundo . ok
		//a soma do triplo do primeiro com o terceiro.  ok
		//o terceiro elevado ao cubo.
		
		double dobro = primeiroInt*2;
		double metade = segundoInt/2;
		double produto = dobro*metade;
		double soma = (primeiroInt*3)+terceiroComPonto;
		double elevado = (double)Math.pow(terceiroComPonto,3);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("O produto do dobro do primeiro com metade do segundo é : %.0f " , produto);
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("A soma do triplo do primeiro com o terceiro é : " + soma);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" O terceiro elevado ao cubo é : " + elevado);
		System.out.println("----------------------------------------------------------------------");
	}

}
