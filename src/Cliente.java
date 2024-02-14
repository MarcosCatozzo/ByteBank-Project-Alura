public class Cliente extends Conta {
     private String nome;
     private String cpf;
     private String profissao;

    public String getNome(){

        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public void setNome(String nome){
        this.nome = this.nome;
    }

    public  void setCpf(String cpf){
        this.cpf = this.cpf;
    }

    public void setProfissao(String profissao){
        this.profissao = this.profissao;
    }
}
