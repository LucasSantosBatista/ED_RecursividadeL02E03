package view;
import controller.ParController;

public class Main {

	public static void main(String[] args) {
		int[] vet = {81, 49, 87, 38, 21, 66, 2, 91, 83, 80, 100, 70};
		int tamanho = vet.length-1;
	
		ParController pCont = new ParController();
		int resultado = pCont.calculaPar(vet, tamanho);
		System.out.println("Quantidade de números pares: " + resultado);
	}

}
