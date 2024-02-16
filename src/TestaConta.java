public class TestaConta {
    public static void main(String[] args) {

        Cliente conta1 = new Cliente();
        conta1.nome = "Marcos";
        conta1.cpf = "222.222.222.22";
        conta1.profissao = "Programador";
        conta1.deposita(100);
        conta1.titularDaConta = conta1;
        System.out.println("Saldo igual : " + conta1.getSaldo());

        System.out.println(conta1.cpf);


        Cliente conta2 = new Cliente();
        conta2.nome = "Maria";
        conta2.cpf = "333.333.333.33";
        conta2.profissao = "Qualidade";
        conta2.deposita(200);
        conta2.titularDaConta = conta2;

        System.out.println("Saldo igual : " + conta2.getSaldo());

        conta2.transfere(100, conta1);

        System.out.println(conta1.titularDaConta.nome);
        System.out.println(conta2.titularDaConta.nome);


    }
}
