import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EstatisticasUmidadeTest {

		@Test
void testMedia() {
EstatisticasUmidade eu = new EstatisticasUmidade();
		eu.setValor(50.0);
		eu.setValor(40.0);
		eu.setValor(55.0);
		eu.setValor(70.0);
		eu.setValor(50.0);
		
		double media = eu.media(3);
		assertEquals(48.3, media, 0.1);
		System.out.println(media);
		
		media = eu.media(5);
		
		System.out.println(media);
		
		assertEquals(53, media, 0.1);
}
		
		@Test
	void testDesvioPadrao() {
			EstatisticasUmidade eu = new EstatisticasUmidade();
			eu.setValor(50.0);
			eu.setValor(40.0);
			eu.setValor(55.0);
			eu.setValor(70.0);
			eu.setValor(50.0);
			
			double desvio = eu.desvioPadrao(3);
			System.out.println(desvio);
			
			assertEquals(6.23, desvio, 0.1);
			
			desvio = eu.desvioPadrao(5);	
			System.out.println(desvio);
			assertEquals(9.79, desvio, 0.1); 
		} 
		

}
