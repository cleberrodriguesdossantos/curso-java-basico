package atividadeAula11ao13;

/*Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 * 
 */

import java.util.Scanner;

public class Exercicio4MediaDeNotas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" informe a primeira nota : ");
		double nota1 = leitor.nextDouble();
		
		System.out.println(" informe a segunda nota : ");
		double nota2 = leitor.nextDouble();
		
		System.out.println(" informe a terceira nota : ");
		double nota3 = leitor.nextDouble();
		
		System.out.println(" Por fim, informe a quarta nota : ");
		double nota4 = leitor.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println(" A média das notas "+nota1+","+nota2+","+nota3+","+nota4+" é: " + media);

	}

}
