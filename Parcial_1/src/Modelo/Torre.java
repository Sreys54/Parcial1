package Modelo;

public class Torre {
//Atributos*************************************************************
	private String nombre;
	private int posicionInicial;
	private int derecha;
	private int izquierda;
	private int atras;
	private int adelante;
	private int posicionActual;
//Constructor***********************************************************
	public Torre(String nombre, int posicionInicial, int derecha, int izquierda, int atras, int adelante,
			int posicionActual) {
		super();
		this.nombre = nombre;
		this.posicionInicial = posicionInicial;
		this.derecha = derecha;
		this.izquierda = izquierda;
		this.atras = atras;
		this.adelante = adelante;
		this.posicionActual = posicionActual;
	}
//Metodos********************************************************************
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
	public int getDerecha() {
		return derecha;
	}
	public void setDerecha(int derecha) {
		this.derecha = derecha;
	}
	public int getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(int izquierda) {
		this.izquierda = izquierda;
	}
	public int getAtras() {
		return atras;
	}
	public void setAtras(int atras) {
		this.atras = atras;
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
	
}
