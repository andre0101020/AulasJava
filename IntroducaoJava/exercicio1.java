package IntroducaoJava;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
	
	System.out.println("Escreva um numero: ");
	n1=ler.nextInt();
	System.out.println("Escreva um numero: ");
	n2=ler.nextInt();
	System.out.println("Escreva um numero: ");
	n3=ler.nextInt();
	
	if  (n1>n2 && n1>n3)  
	System.out.println("O maior numero que voce colocou foi "+ n1);	
	
	if(n2>n1 && n2>n3)
		System.out.println("O maior numero que voce colocou foi "+ n2);
	else 
		System.out.println("O maior numero que voce colocou foi "+ n3);
	
		
	
		
	
	}


}