package br.com.bytebank.banco.Modelo;

/**
 * Classe que representa informações de um cliente
 * @author Marcos
 * @version 0.1
 */
public  abstract class Cliente extends Conta {
    private String nome;
    private String cpf;
     private String profissao;

    /**
     * Construtor que chama o Construtor da classe base
     */
    public Cliente(int agencia, int conta){
          super(12345 , 123);
     }

     public String getNome(){
          return nome;
     }

     public String getCpf(){
          return cpf;
     }

     public String getProfissao(){
          return profissao;
     }

     public void setNome(String nome){
          this.nome = nome;
     }

     public void setCpf(String cpf){
          this.cpf = cpf;
     }

     public void setProfissao(String profissao){
          this.profissao = profissao;
     }

    @Override
    public void deposita(double valor) {

    }
}
