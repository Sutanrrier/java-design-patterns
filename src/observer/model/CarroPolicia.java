package observer.model;

import java.util.Observable;
import java.util.Observer;

import observer.interfaces.Carro;

public class CarroPolicia implements Observer, Carro{

	//Méotodo que vai atualizar os Observers das ações feitas pelo Subject (Observable)
	
	@Override
	public void update(Observable obs, Object action) {
		String acao = String.valueOf(action);
		if(acao == "frente") {
			this.frente();
		}
		else if(acao == "direita") {
			this.direita();
		}
		else if(acao == "esquerda") {
			this.esquerda();
		}
		else if(acao == "para") {
			this.para();
		}
	}

	public void frente() {
		System.out.println("Viatura segue em frente!");
	}

	public void direita() {
		System.out.println("Viatura vira a direita!");
	}

	public void esquerda() {
		System.out.println("Viatura vira a esqueda!");
	}

	public void para() {
		System.out.println("Viatura parou!");
	}
	
}
