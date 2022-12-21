package atividadeAula11ao13;
/*Faça um Programa que peça dois números e imprima a soma.
 * 
 */

import java.util.Scanner;

public class Exercicio3DoisNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Informe o primeiro numero: ");
		int num1 = leitor.nextInt();
		
		System.out.println(" informe o segundo numero: ");
		int num2 = leitor.nextInt();
		 
		int soma = num1 + num2;
		
		System.out.println(" a soma do numero " + num1 + " e o numero " + num2 + " é : " + soma);

	}

}
