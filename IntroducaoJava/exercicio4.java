package IntroducaoJava;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int num, num2;
		System.out.println("Escreva um numero para saber se e par ou impar: ");
		num=ler.nextInt();
		
		 if(num%2==0)
		 {
		  System.out.println("Seu numero e par!!!");
		  System.out.println("a raiz de "+num+" e="+ Math.sqrt(num));
		 }
		 else 
		 {
		   System.out.println("Seu numero e impar!!!");
		   System.out.println("a raiz de "+num+" e="+ Math.ulp(num));
			 
		 }
		 
		 
		
	     }  

}
