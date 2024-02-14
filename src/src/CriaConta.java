package src;

public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);

        System.out.println(primeiraConta.pegaSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.pegaSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(500);

        System.out.println("O valor da primeira conta é: " + primeiraConta.pegaSaldo());
        System.out.println("O valor da segunda conta é : " + segundaConta.pegaSaldo());

        System.out.println(primeiraConta.numeroDaConta);
        System.out.println(primeiraConta.agenciaDaConta);


    }
}
