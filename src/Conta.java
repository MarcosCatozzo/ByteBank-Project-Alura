public class Conta {

    private int numeroDaConta;
    private int numeroDaAgencia;
    private double saldo;

    Cliente titularDaConta;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
            return false;
    }

    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public int getNumeroDaAgencia(){
        return this.numeroDaAgencia;
    }

    public double getSaldo(){return this.saldo;}

    public void setNumeroDaConta(int numeroDaConta ){
        this.numeroDaConta = this.numeroDaConta;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia){
        this.numeroDaAgencia = this.numeroDaAgencia;
    }

    public void setSaldo(double saldo){
        this.saldo = this.saldo;
    }
}
