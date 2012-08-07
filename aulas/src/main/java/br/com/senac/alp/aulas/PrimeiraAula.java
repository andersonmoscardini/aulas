package br.com.senac.alp.aulas;


public class PrimeiraAula {
	
	private static PrimeiraAula instancia = new PrimeiraAula();
	
	
	private PrimeiraAula() {

		super();
	}
	
	public double somaTotal(double[] valores) {
		
		double resultado = 0.0;
		
		if (valores == null) {
			resultado = Double.NaN;
		}else if (valores.length == 1){
			resultado = valores[0];
		}else{
				for(int i = 0;  i< valores.length; i++) {
				resultado = resultado + valores[i];
		
			}		
		}
		return resultado;
	}
	
	public static PrimeiraAula getInstancia() {
		
		return PrimeiraAula.instancia;
	}
}
