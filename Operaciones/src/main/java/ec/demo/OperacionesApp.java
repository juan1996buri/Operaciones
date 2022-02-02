package ec.demo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;import javax.crypto.Cipher;

import ec.demo.damain.Cliente;

public class OperacionesApp {

	public static void main(String[] args) {
		Calculadora calculadora=new Calculadora();
		calculadora.setValor1(20);
		calculadora.setValor2(3);
		calculadora.modulo();
		
		calculadora.setValor1(10);
		calculadora.setValor2(20);
		calculadora.Sumar();
		calculadora.Resta();
		calculadora.Multiplicacion();
		calculadora.Division();
		calculadora.modulo();
		
		Cliente cliente=new Cliente();
		cliente.setCedula("2323");
		cliente.setNombre("Andres");
		cliente.setDireccion("Azogues");
		cliente.setEmail("andres98buri@gmail.com");
		cliente.setFechaNacimiento(Date.valueOf("1996-09-21"));	
		
		
		cliente.CalcularEdad(cliente.getFechaNacimiento());
		System.out.println(cliente);
		 
		
	}

}
