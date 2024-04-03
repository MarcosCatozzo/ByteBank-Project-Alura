package br.com.bytebank.banco.Modelo;

/**
 * Classe representa a moldura de uma conta
 * @author Marcos
 * @version 0.1
 *
 */

public abstract class Conta extends Object {

    private int numeroDaConta;
    private int numeroDaAgencia;
    protected double saldo;
    private Cliente titularDaConta;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir de uma agencia e conta
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){ //construtor
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.numeroDaAgencia = agencia;
        this.numeroDaConta = numero;
        this.saldo = 0;
       // System.out.println("Estou criando uma conta " + this.numeroDaConta);
    }

    public abstract void deposita(double valor);

    /**
     * valor precisa ser maior do que saldo
     * @param valor
     * @throws saldoInsuficienteException
     */
    public void saca(double valor) throws saldoInsuficienteException { // Exceção

        if (this.saldo < valor) {
            throw new saldoInsuficienteException("Saldo: " + this.saldo + " Valor " + valor);
        }
        this.saldo -= valor;
    }

    /**
     * metodo que recebe um valor e uma conta de destino e chama o metodo saca para validar a transferencia
     * @param valor
     * @param destino
     * @throws saldoInsuficienteException
     */
    public void transfere(double valor, Conta destino) throws saldoInsuficienteException { // metodo
        this.saca(valor);
        destino.deposita(valor);
    }

    public Cliente titularDaConta(Cliente conta1){
        return this.titularDaConta = conta1;
    }

    //getters e Setters
    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public int getNumeroDaAgencia(){
        return this.numeroDaAgencia;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getTitularDaConta(){
        return this.titularDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta ){
        this.numeroDaConta = this.numeroDaConta;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia){
        this.numeroDaAgencia = this.numeroDaAgencia;
    }

    public void setSaldo(double saldo){
        this.saldo = this.saldo;
    }

    public void  setTitularDaConta(Cliente titularDaConta){
        this.titularDaConta = this.titularDaConta;
    }

    @Override
    public String toString() {
        return "Número: " + this.getNumeroDaConta();
    }
}
