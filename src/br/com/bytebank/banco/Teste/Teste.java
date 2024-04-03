package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.Cliente;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);

		System.out.println(cc);
		System.out.println(cp);
	}

	static void println(){}
	static void println(int a){}
	static void println(boolean valor){}
}