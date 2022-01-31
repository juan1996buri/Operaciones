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
		System.out.println("La suma es:  "+(valor1+valor2));
	}
	public void Resta() {
		System.out.println("La resta es :  "+(valor1-valor2));
	}
	public void Multiplicacion() {
		System.out.println("La multiplicacion es:  "+(valor1*valor2));
	}
	
	public void Division() {
		System.out.println("La division es:  "+(valor1*valor2));
	}
	
}
