import java.util.Scanner;

public class jokenpo {
        public static void main (String args []){
        int j1,j2;			//Escolhas dos jogadores.
        	
		Scanner sc = new Scanner(System.in);
		System.out.println("Jokenpo!"+"\n"+
							"Digite 1 para Pedra."+"\n"+
							"Digite 2 para Papel."+"\n"+
							"Digite 3 para Tesoura."+"\n");
		
		System.out.println("Escolha do jogador 1: ");
		j1 = sc.nextInt();
		
		System.out.println("Escolha do jogador 2: ");
		j2 = sc.nextInt();
		
		switch(j1) {
			case 1:
				switch(j2) {
					case 1:
						System.out.println("teste");
						break;
					case 2:
						break;
					case 3:
						break;
					default:
						break;
				}
				
			case 2:
				switch(j2) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					break;
			}
				
			case 3:
				switch(j2) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					break;
			}
				
			default:
				break;
		}
	
	}
}