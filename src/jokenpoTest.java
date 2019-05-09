import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jokenpoTest extends jokenpo {

	@Test
	void testjogoEmpate() {
		System.out.println("Teste JUnit para empates");
		int j1 = 0;
		int j2 = 0;
		
		for (int aux = 1; aux < 4; aux++) {
			j1 = aux;
			j2 = aux;
			jokenpo instance = new jokenpo();
			int ResultExp = 0;
			int Result = instance.jogo(j1, j2);
			assertEquals(ResultExp, Result,0);
		}		
		
		System.out.println("Teste JUnit para Jogador 2 Vencedor");
		for (int aux = 1; aux < 4; aux++) {
			j1 = aux;
			j2 = j1 + 1;
			if (j2==4)
				j2 = 1;
			jokenpo instance = new jokenpo();
			int ResultExp = 2;
			int Result = instance.jogo(j1, j2);
			assertEquals(ResultExp, Result,0);
		}		
		
		System.out.println("Teste JUnit para Jogador 1 Vencedor");
		for (int aux = 1; aux < 4; aux++) {
			j1 = aux;
			j2 = j1 + 2;
			if (j2==4)
				j2 = 1;
			if (j2==5)
				j2 = 2;
			jokenpo instance = new jokenpo();
			int ResultExp = 1;
			int Result = instance.jogo(j1, j2);
			assertEquals(ResultExp, Result,0);
		}		
		
	}
}
