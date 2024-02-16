package src;

public class TestaBanco {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.nome = "Marcos";
    cliente.cpf = "222.222.222.22";
    cliente.profissao = "Desenvolvedor";

    Conta primeiroCliente = new Conta();
    primeiroCliente.titularDaConta = cliente;

        System.out.println(primeiroCliente.titularDaConta.nome);

    }
}
