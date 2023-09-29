package Modelo;

public class Peon {
//Atributos************************************************
	private String nombre;
	private int posicionInicial;
	private int adelante;
	private int posicionActual;
	
//Constructor************************************************
	public Peon(String nombre, int posicionInicial, int adelante, int posicionActual) {
		super();
		nombre = "Peon";
		adelante = 0;
		this.nombre = nombre;
		this.posicionInicial = posicionInicial;
		this.adelante = adelante;
		this.posicionActual = posicionActual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosicionInicial() {
		return posicionInicial;
	}

	public void setPosicionInicial(int posicionInicial) {
		this.posicionInicial = posicionInicial;
	}

	public int getAdelante() {
		return adelante;
	}

	public void setAdelante(int adelante) {
		this.adelante = adelante;
	}

	public int getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}

	//Metodos******************************************************
	
}
