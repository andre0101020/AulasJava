package IntroducaoJava;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int anos;
		System.out.println("Escreva sua idade: ");
		anos=ler.nextInt();
		
		  if(anos>=10 && anos<=14)
			System.out.println("voce e infantil!");
		  if(anos>=15 && anos<=17)
			System.out.println("voce e juvenil!");
		  if(anos>=18)
				System.out.println("voce e juvenil!");
		  if(anos<10)
			  System.out.println("essa classificacao e a partir dos 10 anos");
		  
				
	}

}
