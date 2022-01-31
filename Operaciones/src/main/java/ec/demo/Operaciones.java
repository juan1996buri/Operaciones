package ec.demo;

public class Operaciones {
	private int valor1;
	private int valor2;
	public Operaciones() {
		super();
		this.valor1=0;
		this.valor2=0;
	}
	public Operaciones(int valor1, int valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public void Sumar() {
		System.out.print("La suma:  "+(valor1+valor2));
	}
	public void Resta() {
		System.out.print("La resta:  "+(valor1-valor2));
	}
}
