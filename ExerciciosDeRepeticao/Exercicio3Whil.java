package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercicio3Whil {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int num=0, menos=0, mais=0;
	
	while(num!=-99) 
	{
	System.out.println("Escreva sua idade: ");
	num=ler.nextInt();
	if(num<21) 
	{
	 menos=menos+1;
	}
	if(num>50)
	{
		mais=mais+1;
	}
		
	
	}
	System.out.println(menos+" Pessoas tem menos de 21 anos");
	System.out.println(mais+" Pessoas tem mais de 50 anos");
	
		
		

	}

}
