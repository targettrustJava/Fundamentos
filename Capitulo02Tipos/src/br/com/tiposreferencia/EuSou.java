package br.com.tiposreferencia;

public class EuSou {

	public static void main(String[] args) {
		Beleza cassio = new Beleza();
		cassio.setNome("C�ssio Trindade");
		cassio.setFeio(false);

		System.out.println(cassio.getNome() + " � " + cassio.getEuSou());
	}

}
