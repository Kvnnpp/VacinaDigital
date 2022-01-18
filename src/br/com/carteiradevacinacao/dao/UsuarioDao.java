package br.com.carteiradevacinacao.dao;

import br.com.carteiradevacinacao.factory.ConnectionFactory;
import br.com.carteiradevacinacao.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {
    private Connection connection;

    private Long   id;
    private String nome;
    private String cpf;
    private String dataNacimento;
    private String telefone;

    public UsuarioDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        String sql ="INSERT INTO usuario(nome,cpf,dataNacimento,telefone)VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getDataNacimento());
            stmt.setString(4, usuario.getTelefone());
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
