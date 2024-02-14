package src;

public class testaMetodo {
    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.pegaSaldo());

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.pegaSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        contaDaMarcela.transfere(300, contaDoPaulo);
        System.out.println(contaDaMarcela.pegaSaldo());
        System.out.println(contaDoPaulo.pegaSaldo());
    }
}
