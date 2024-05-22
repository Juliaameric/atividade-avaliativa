package avFormativa;

import java.util.Scanner;

public class Operação {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Double valor1, valor2, resultado;
		String operacao;
		
		System.out.println("informe o valor1: ");
		valor1= ler.nextDouble();
		
		System.out.println("informe o valor1: ");
		valor2= ler.nextDouble();
		
		System.out.println("informe a operação desejada.. ela pode ser +(adição), *(multiplicação), - (subtração) ");
		operacao = ler.next();
		
		if (operacao.equals ("+")) {
			resultado = valor1 + valor2;
			System.out.println(" a soma é: "+resultado);
		}
		else if (operacao.equals ("*")) {
			resultado= valor1 * valor2;
			System.out.println(" a multilicação é: "+resultado);
		}
		else if (operacao.equals ("-")) {
			resultado = valor1 - valor2;
			System.out.println(" a subtração é: "+resultado);
		}
		else {
			System.out.println(" sinal invalido");
		}
	}

}
