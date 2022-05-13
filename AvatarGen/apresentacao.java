package AvatarGen;

import java.util.Scanner;

public class apresentacao extends BaseAvatar { 
	Scanner ler = new Scanner(System.in);
	
	   int falarcomquem=0;
	
	public void apresentar() {
		System.out.println("Olá, eu sou "+this.nome+", muito prazer!! Tenho "+this.idade+" anos e sou uma pessoa não-binária. Estou aqui para te ajudar nessa trajetória e tirar suas dúvidas...\n");
		
    } 
	public void falarcomManuOuManu2() {
		System.out.println("Se você quer saber mais sobre a Generation digite o número correspondente as opções abaixo:");
		System.out.println("1- Para conhecer a Generation");
		System.out.println("2- Para tirar sua duvidas");
		falarcomquem=ler.nextInt();
		}
	public void falarcomManuOuManu2erro() {
		System.out.println("Numero invalido tente novamente");
		System.out.println("1- Para conhecer a Generation");
		System.out.println("2- Para tirar sua duvidas");
		falarcomquem=ler.nextInt();
		
	}
	

}
