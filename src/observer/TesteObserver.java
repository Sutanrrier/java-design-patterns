package observer;

import observer.model.CarroPolicia;
import observer.model.CarroRoubado;

public class TesteObserver {

	public static void main(String[] args) {
		
		CarroPolicia carroPolicia = new CarroPolicia();
		CarroRoubado carroRoubado = new CarroRoubado();
		
		//Adiciona um observer ao objeto subject 'carroRoubado'
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.frente();
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.frente();
		carroRoubado.esquerda();
		carroRoubado.para();
	}

}
