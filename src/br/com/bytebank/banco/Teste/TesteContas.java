package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.*;


public class TesteContas {
	public static void main(String[] args) throws saldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.0);

		cc.transfere(10.0,cp);

		cc.saca(10);

		System.out.println(" cc " + cc.getSaldo());
		System.out.println(" cp " + cp.getSaldo());
	}
}
