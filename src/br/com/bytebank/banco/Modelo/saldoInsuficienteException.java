package br.com.bytebank.banco.Modelo;

public class saldoInsuficienteException extends Exception{

	public saldoInsuficienteException(String msg){
		super(msg);
	}
}
