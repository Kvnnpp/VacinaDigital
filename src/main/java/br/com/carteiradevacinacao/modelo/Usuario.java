package main.java.br.com.carteiradevacinacao.modelo;

public class Usuario {

    private int   id;
    private String nome;
    private String cpf;
    private String dataNacimento;
    private String telefone;

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
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

    @Override public String toString() {
        return "Usuario" + '\n' +
                        "ID: " + id +
                        '\n' +
                        "Nome: " + nome +
                        '\n' +
                        "CPF: " + cpf +
                        '\n' +
                        "Data de Nascimento: " + dataNacimento +
                        '\n' +
                        "Telefone: " + telefone +
                        '\n';
    }
}
