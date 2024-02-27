package controller;

public class ParController {

	public ParController() {
		super();
	}
	
	public int calculaPar(int[] vet, int tamanho) {
		if (tamanho == 0) {
			return 0;
		} else {
			if (vet[tamanho]%2 == 0) {
				return 1 + calculaPar(vet, tamanho-1);
			} else {
				return 0 + calculaPar(vet, tamanho-1);
			}
		}
	}

}
