package com.zup.si2;
import com.sun.jna.Native;

public class TestaCalculadoraJNA {

	public static void main(String[] args) {
		CalculadoraJNA calculadora = (CalculadoraJNA)
				Native.load("libsomadorJNA.so", CalculadoraJNA.class);
		System.out.println("A soma é: " + calculadora.soma(1, 2));
	}
}
