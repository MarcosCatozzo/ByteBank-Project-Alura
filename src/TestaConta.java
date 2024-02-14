public class TestaConta {
    public static void main(String[] args) {

        Cliente conta1 = new Cliente();
        conta1.setNome("Julio");
        conta1.setCpf("222.222.222.22");
        conta1.setProfissao("Programador");
        conta1.deposita(100);

        System.out.println("Saldo igual : " + conta1.getSaldo());

        Cliente conta2 = new Cliente();
        conta2.setNome("Maria");
        conta2.setCpf("333.333.333.33");
        conta2.setProfissao("Qualidade");
        conta2.deposita(200);

        System.out.println("Saldo igual : " + conta2.getSaldo());

        conta2.transfere(100, conta1);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}
