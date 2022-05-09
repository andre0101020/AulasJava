package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int num, soma=0;
	
	do
	{
	 System.out.println("Escreva sua soma: ");
	 num=ler.nextInt();
	 soma=num+soma;
	 
		
	} while(num!=0);
	System.out.println("O total da sua soma deu: "+soma);
	System.out.println("Fim da soma!!!");
		
	
	

	}

}
