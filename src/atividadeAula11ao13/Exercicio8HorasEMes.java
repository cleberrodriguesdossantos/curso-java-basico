package atividadeAula11ao13;

import java.util.Scanner;

/*Faça um Programa que pergunte quanto você ganha por hora e o 
 * número de horas trabalhadas no mês.
 *  Calcule e mostre o total do seu salário no referido mês
 *  */
public class Exercicio8HorasEMes {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Qual o valor ganho por hora ? ");
	float valorHora = leitor.nextFloat();
	
	System.out.println(" Quantas horas trabalhada ? ");
	float horasTrabalhada = leitor.nextFloat();
	
	float salario = horasTrabalhada*valorHora;
	
	System.out.println("Voce trabalhou "+ horasTrabalhada + " horas trabalhada(s). " );
	System.out.println("------------------------------------------------------------");
	System.out.println(" O total de seu salario neste mês é de: " + salario);
	
	}

}
