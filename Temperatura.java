package avFormativa;

import java.util.Scanner;

public final class Temperatura {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		Double celsius, fh;
	 
		System.out.println(" insira a temperatura em fahrenheit: ");
		fh= ler.nextDouble();
		
		 celsius = ((fh-32)*5)/9;
		
		System.out.println(" a temperatura em celsius é: " +celsius);
		
		ler.close();
	}
	}


