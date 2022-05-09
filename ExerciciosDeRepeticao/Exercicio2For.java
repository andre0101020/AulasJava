package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int np=0, ni=0, n;
		
		for(int x=0;x<10;x++)
		{
		 System.out.println("Escreva os numeros para saber quantos sao pares e quantos sao impar: ");
		 n=ler.nextInt();
		 if (n%2==0)
		 np=np+1;
		 
		else 
		   ni=ni+1;
		}
		System.out.println("voce digitou "+np+" numeros pares");
		System.out.println("voce digitou "+ni+" numeros impars");

}
    }
