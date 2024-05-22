package avFormativa;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int area, lado;
		System.out.println(" escreva o tamanho do lado da figura");
		lado = ler.nextInt();
		area = lado*lado;
		
		System.out.println(" a area da figura é: "+area);
		ler.close();

	}

}
