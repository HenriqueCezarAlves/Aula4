import java.util.Scanner;
public class Cerveja {
	public static void main(String[] args) {
		int c = 99;
		Scanner dado = new Scanner(System.in);
		while ( c > 0){
			System.out.println( c + "cervejas na freezer");
			System.out.println(" Pego uma garrafa e passo para a frente");
			c = c - 1;
			System.out.println( "Agora s�o " + c + " cervejas na freezer" );
			
			if ( c == 0){
				System.out.println("\n Deseja reabastecer o freezer? (sim = 1 e n�o = 2)");
				int nome = dado.nextInt();
				if (nome == 1){
					System.out.println( "quantas cervejas deseja adicionar?");
					int res = dado.nextInt();
					c = res;
					System.out.println(" o freezer ser� reabastecido \n");
				}
				else{
					System.out.println("o freezer n�o ser� reabastecido ");
				}
			}	
		
		}
		
		dado.close(); //fechar dado	
	}	
}


