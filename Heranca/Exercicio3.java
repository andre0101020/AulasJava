package Heranca;

import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Collection<String> frutas = new ArrayList();
		Scanner ler = new Scanner(System.in);
		 String n1, n2;
		
		frutas.add("Banana");
		frutas.add("Uva");
		frutas.add("Abacaxi");
		frutas.add("Maça");
		
		System.out.println("suas frutas sao"+frutas);
		System.out.println("Para remover uma fruta digite o nome dela ");
		n1=ler.next();
		frutas.remove(n1);
		System.out.println("Frutas atualizadas "+frutas);
		System.out.println("Para adicionar uma fruta digite o nome dela ");
		n2=ler.next();
		frutas.add(n2);
		System.out.println("voce adicionou "+n2);
		System.out.println(frutas);
		
		
		
		
		
		
		
	}
	
	 
	

}
