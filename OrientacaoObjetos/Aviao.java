package OrientacaoObjetos;

public class Aviao {
	
	String nome;
	String cor;
	int pessoas;
	boolean funcionado;
	
	void status() {
		System.out.println("Nome do avião: "+nome);
		System.out.println("Cor do avião: "+cor);
		System.out.println("Quantidade de pessoas no avião: "+pessoas);
		System.out.println("o avião esta vonado: "+funcionado);
	}
	
	void voando() {
		this.funcionado =true;
		
		
	}
	
	void quebrado() {
		this.funcionado =false;
		
	}
	
	
	
		

}
