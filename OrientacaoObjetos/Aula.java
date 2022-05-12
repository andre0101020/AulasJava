package OrientacaoObjetos;

import java.util.Arrays;
import java.util.Scanner;
public class Aula {
	Scanner ler = new Scanner(System.in);

	String tempo;
	String dia;
	String dia1;
	String professor;
	int presente;
	int alunos;

	// METODO CONTRUTOR

	public Aula() {
		this.alunos = 46;
		this.professor = "Andreson";
		this.tempo = "8 Horas";
	}

	// METODOS

	public void terAula() {
		System.out.println(
				"Que dia estamos? (Domingo|Segunda-feira|Terça-feira|Quarta-feira|Quinta-feira|Sexta-feira|Sábado)");
		this.dia1 = ler.next();

		if (this.dia1.equals("Domingo") || this.dia1.equals("Sabado")) 
			this.dia = "Não vai ter aula!!";
		

		else 
			this.dia = "Vai ter aula";
		

	}

	public void status() {
		System.out.println("O tempo da aula é de: " + this.tempo);
		System.out.println("vai ter aula?: " + this.dia);
		System.out.println(this.professor+" vai dar a aula");
		System.out.println("Sua sala tem "+this.alunos+" alunos");
		
		
	}
	
	public void carregamento() throws InterruptedException {
		
		
		System.out.println("\nFazendo chamada(.)");
		Thread.sleep(400);
		System.out.flush();
		System.out.println("\nFazendo chamada(..)");
		Thread.sleep(400);
		System.out.flush();
		System.out.println("\nFazendo chamada(...)");
		Thread.sleep(400);
		System.out.flush();
	}
	
public void presentes() {
		
		if(this.dia1.equals("Domingo")||this.dia1.equals("Sabado")) {
		this.presente=0;
		System.out.println(this.presente+" pessoas vieram para a aula");
		}
		else {
		this.presente=40;
		System.out.println(this.presente+" pessoas vieram para a aula");
		}
	}
	
	

}
