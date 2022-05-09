package IntroducaoJava;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		String n1 , n2 , n3 ;
	
	System.out.println("Escreva 3 numeros, letras ou palavras em sequencia: ");
	n1=ler.next();
	n2=ler.next();
	n3=ler.next();
	
	String[] arrayOfStrings = {n1, n2, n3};
	Arrays.sort(arrayOfStrings);
	
	System.out.println("Ordenando seu array.");
	Thread.sleep(400);
	System.out.flush();
	System.out.println("Ordenando seu array..");
	Thread.sleep(400);
	System.out.flush();
	System.out.println("Ordenando seu array...");
	Thread.sleep(400);
	System.out.flush();
	
	System.out.print("Seu array ordenado e: "+arrayOfStrings[0]+" | "+arrayOfStrings[1]+" | "+arrayOfStrings[2]+" .");

	
	}

}
