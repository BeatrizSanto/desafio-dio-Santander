package desafio_dio_Mod3;

import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
        
	       Scanner leitor = new Scanner(System.in);

	  int desconto = leitor.nextInt();

	  int preco = leitor.nextInt();



	  int precoNovo = preco - (preco * desconto /  100  );

	  System.out.println( precoNovo );
	        
	       
	    }
}
