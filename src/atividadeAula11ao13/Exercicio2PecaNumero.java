package atividadeAula11ao13;
/*Faça um Programa que peça um número e então mostre a 
 * mensagem O número informado foi [número].
 * */
 
import java.util.Scanner;

public class Exercicio2PecaNumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Por favor, informe um numero: ");
		int numero = leitor.nextInt();
		
		System.out.println(" O numero informado foi: " + numero);

	}

}
