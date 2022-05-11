package OrientacaoObjetos;

public class Cliente {
	
	String nome;
	int idade;
	boolean humor;
	boolean internet;
	
	
	void status() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Feliz ou trist: "+this.humor);
		System.out.println("Vai trabalhar?: "+this.internet);
	}
	
	void trabalhar() {
		 this.internet = true;
		 
		
	}
	void naotrabalhar() {
		 this.internet = false;
		 
		
	}
	
	void tomarcafe() {
		this.humor = true;
		
		}
	
	void naotomarcafe() {
		this.humor = false;
		
		}
	
	

}
