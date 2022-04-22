package adapter;

public class TesteAdapter {

	public static void main(String[] args) {
		CotacaoAdapter cotacao = new CotacaoAdapter();
		cotacao.setValor(15.00);
		System.out.println("Valor em Real 'R$': " + cotacao.getValor());
		System.out.println("Valor em Dolar '$': "+ cotacao.getValorDolar());

	}

}
