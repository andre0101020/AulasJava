package AvatarGen;

public class Rum extends BaseAvatar {

	public static void main(String[] args) {
	   apresentacao a1 = new apresentacao();
	   Manu1 m1 = new Manu1();
	   Manu2 m2 = new Manu2();
	   
	   a1.apresentar();
	   a1.falarcomManuOuManu2();
	   
	   
	   
	   if(a1.falarcomquem==1)
	     m1.perguntasmanu1();
	   
	  if(a1.falarcomquem==2)
		  m2.perguntasmanu2();
	  
	  while(a1.falarcomquem!=(1)||a1.falarcomquem!=(2)) {
		  a1.falarcomManuOuManu2erro();		  
	  }
		  
		  
		  
		  
	  
	  
		  
	
	}

}
