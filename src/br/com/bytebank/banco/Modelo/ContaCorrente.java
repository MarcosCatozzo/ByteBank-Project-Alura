package br.com.bytebank.banco.Modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws saldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valor);
	}

	@Override
	public void deposita(double valor){
		this.saldo += this.saldo = valor;
	}

	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
}
