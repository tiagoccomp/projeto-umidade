import java.awt.List;
import java.util.ArrayList;
/**
* A classe para calcular média e desvio padrão de uma amostra de umidade.
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
	* O método ({@code setValor}) para armazenar os valores de umidade
	*
	* @param umidade valor a ser armazenado
	*/
	public void setValor(double umidade)
	{
		lstUmidade.add(umidade);
	}
	/**
	* O método ({@code media}) que calcula a media de uma amostragem
	*
	* @param amostra quantidade de amostras para cálculo da media
	* @return valor do desvio padrão
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
	* O método ({@code desvioPadrao}) que calcula o devio padrão de uma
	amostragem
	*
	* @param amostra quantidade de amostras para cálculo do devio padrão
	* @return valor do desvio padrão
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