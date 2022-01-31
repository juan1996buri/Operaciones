package ec.demo;

public class OperacionesApp {

	public static void main(String[] args) {
		Operaciones operaciones=new Operaciones();
		operaciones.setValor1(3);
		operaciones.setValor2(5);
		operaciones.Sumar();
		
		operaciones.setValor1(5);
		operaciones.setValor2(2);
		operaciones.Resta();

		operaciones.setValor1(5);
		operaciones.setValor2(2);
		operaciones.Multiplicacion();
		
		operaciones.setValor1(3);
		operaciones.setValor2(2);
		operaciones.Division();
	}

}
