package atividadeAula11ao13;

import java.util.Scanner;

/*Faça um Programa que calcule a área de um quadrado,
 *  em seguida mostre o dobro desta área para o usuário. 
 * 
 */

public class Exercicio7AreaDeUmQuadrado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Informe a lagura : ");
		float largura = leitor.nextFloat();
		
		System.out.println(" Informe o comprimento :");
		float comprimento = leitor.nextFloat();
		
		float area = comprimento*largura;
		float areaDobro = area *2;
		
		System.out.println(" A Area deste quadrado é de : " + area);
		System.out.println(" O dobro da area do quadrado é de : " + areaDobro);
		
		

	}

}
