package br.com.bytebank.banco.Teste;


import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.saldoInsuficienteException;

public class TestaSacaNew {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(2222 , 3333);
		conta.deposita(200);
		try {
			conta.saca(210);
		}catch (saldoInsuficienteException tratando){
			System.out.println(tratando.getMessage());
		}
		System.out.println(conta.getSaldo());

	}
}
