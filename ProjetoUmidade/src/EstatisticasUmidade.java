import java.awt.List;
import java.util.ArrayList;
/**
* A classe para calcular m�dia e desvio padr�o de uma amostra de umidade.
* @author Tiago Cruz e Roberto Santos
* @since 1.0
*/

public class EstatisticasUmidade {
	/**
	* Vetor para armazenar as medidas
	*/
	private ArrayList<Double> lstUmidade;
	/**
	* O construtor ({@code EstatisticasUmidade} que inicializa o vetor para armazenar
	as medidas
	*
	*/
	public EstatisticasUmidade()
	{
		lstUmidade = new ArrayList<Double>();
	}
	/**
	* O m�todo ({@code setValor}) para armazenar os valores de umidade
	*
	* @param umidade valor a ser armazenado
	*/
	public void setValor(double umidade)
	{
		lstUmidade.add(umidade);
	}
	/**
	* O m�todo ({@code media}) que calcula a media de uma amostragem
	*
	* @param amostra quantidade de amostras para c�lculo da media
	* @return valor do desvio padr�o
	*/
	public double media(int amostra)
	{
		double soma = 0.0;
		for (int i = 0; i < amostra; i++) {

				soma = soma + lstUmidade.get(i);
}

		return soma/amostra;
}
	/**
	* O m�todo ({@code desvioPadrao}) que calcula o devio padr�o de uma
	amostragem
	*
	* @param amostra quantidade de amostras para c�lculo do devio padr�o
	* @return valor do desvio padr�o
	*/

	public double desvioPadrao(int amostra)
{
		double media = media(amostra);
		double st = 0.0;
		for (int i = 0; i < amostra; i++) {
			
				st = st + Math.pow(lstUmidade.get(i) - media, 2);
}

		return Math.sqrt(st/amostra);
}
	
}