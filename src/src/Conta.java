package src;

public class Conta {

        private double saldo;
        int agenciaDaConta;
        int numeroDaConta;
        Cliente titularDaConta;

        void deposita(double valor){
                this.saldo = this.saldo + valor;
        }

        public boolean saca(double valor) {
                if (this.saldo >= valor) {
                        this.saldo = this.saldo - valor;
                        return true;
                }else {
                        return false;
                }
        }

        public boolean transfere(double valor, Conta destino){
             if( this.saldo >= valor){
                     this.saldo -= valor;
                     destino.deposita(valor);
                return true;
             }
            return false;
        }

        public double getpegaSaldo(){
                return this.saldo;
        }
}
