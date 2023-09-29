package Modelo;

public class Caballo {
//Atributos**************************************
	private String name;
	private int saltoL;
	private int posicionActual;
	
	
//constructor************************************
	public Caballo(String name, int saltoL, int posicionActual) {
		super();
		this.name = name;
		this.saltoL = saltoL;
		this.posicionActual = posicionActual;
	}
//metodos*******************************************


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSaltoL() {
		return saltoL;
	}


	public void setSaltoL(int saltoL) {
		this.saltoL = saltoL;
	}


	public int getPosicionActual() {
		return posicionActual;
	}


	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}
	
}
