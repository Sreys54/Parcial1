package Modelo;

import java.util.ArrayList;

public class Coordenadas {
//Atributos*******************************************
	//Las filas se van a empezar a contar de abajo hacia arriba
	//La de abajo es la fila 1 y la de arriba la fila 8
	private ArrayList<Integer> fila1 = new 	ArrayList<Integer>();
	fila1.add(11);
	fila1.add(12);
	fila1.add(13);
	fila1.add(14);
	fila1.add(15);
	fila1.add(16);
	fila1.add(17);
	fila1.add(18);
	private ArrayList<Integer> fila2 = new 	ArrayList<Integer>();
	fila2.add(21);
	fila2.add(22);
	fila2.add(23);
	fila2.add(24);
	fila2.add(25);
	fila2.add(26);
	fila2.add(27);
	fila2.add(28);
	private ArrayList<Integer> fila3 = new 	ArrayList<Integer>();
	fila3.add(31);
	fila3.add(32);
	fila3.add(33);
	fila3.add(34);
	fila3.add(35);
	fila3.add(36);
	fila3.add(37);
	fila3.add(38);
	private ArrayList<Integer> fila4 = new 	ArrayList<Integer>();
	fila4.add(41);
	fila4.add(42);
	fila4.add(43);
	fila4.add(44);
	fila4.add(45);
	fila4.add(46);
	fila4.add(47);
	fila4.add(48);
	
	//En las columnas se cuenta de izquierda a derecha
	//La columna 1 es la primera de la izquierda, columna 8 la de la derecha
	private ArrayList<Integer> columnas = new 	ArrayList<Integer>();
	
//Constructor******************************************
	public Coordenadas(ArrayList<Integer> filas, ArrayList<Integer> columnas) {
		super();
		this.filas = filas;
		this.columnas = columnas;
	}
	public ArrayList<Integer> getFila1() {
		return fila1;
	}
	public void setFila1(ArrayList<Integer> fila1) {
		this.fila1 = fila1;
	}
	public ArrayList<Integer> getFila2() {
		return fila2;
	}
	public void setFila2(ArrayList<Integer> fila2) {
		this.fila2 = fila2;
	}
	public ArrayList<Integer> getFila3() {
		return fila3;
	}
	public void setFila3(ArrayList<Integer> fila3) {
		this.fila3 = fila3;
	}
	public ArrayList<Integer> getFila4() {
		return fila4;
	}
	public void setFila4(ArrayList<Integer> fila4) {
		this.fila4 = fila4;
	}
	public ArrayList<Integer> getColumnas() {
		return columnas;
	}
	public void setColumnas(ArrayList<Integer> columnas) {
		this.columnas = columnas;
	}
//Metodos************************************************

}
