package ifsc;
/**
 * 
 * @author GabrieldoRosarioBatista
 * @date 30/09/2022
 * @version1.0
 */
public class MainGit {

	public static void main(String[] args) {
	
	}
	/**
	 * 
	 * @param vetor
	 * @return
	 */
	public Double[] multiplicaVetor(Double[]vetor) {
		Double [] novoVetor = new Double[vetor.length];
		for (int i = 0; i < novoVetor.length; i++) {
			
		novoVetor[i] = novoVetor[i]*novoVetor[i];	
			
		}
			
		return novoVetor;
	}
	
	
}
