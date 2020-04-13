package com.zup.si2;
import com.sun.jna.Native;

public class TestaCalculadoraJNA {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		CalculadoraJNA calculadora = (CalculadoraJNA)
				Native.loadLibrary("libsomadorJNA.so", CalculadoraJNA.class);

		int num1 = Integer.parseInt("1");
		int num2 = Integer.parseInt("2");

		int resultado = calculadora.soma(num1, num2);
		System.out.println("A soma é: " + resultado);
	}
}