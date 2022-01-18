package br.com.carteiradevacinacao.modelo;

public class Usuario {

    private Long   id;
    private String nome;
    private String cpf;
    private String dataNacimento;
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "ID: "+id+"" +
                        "\n"+ "Nome: "+nome+"" +
                        "\n"+ "CPF: "+cpf+"" +
                        "\n"+"Data de Nacimento: "+dataNacimento+"\n";
    }

}
