package main.java.br.com.carteiradevacinacao.dao;

import main.java.br.com.carteiradevacinacao.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    private static List<Usuario> usuarios = new ArrayList<>();

    public void adicionar(Usuario usuario) {
        usuario.setId(+ 1);
        usuarios.add(usuario);
    }

    public void editar(Usuario usuario) {
        remover(usuario);
        adicionar(usuario);
    }

    public void remover(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public Usuario buscar(String nomeUsuario) {
        return usuarios.stream()
                        .filter(c -> c.getNome().equals(nomeUsuario))
                        .findFirst()
                        .orElse(null);
    }

    public UsuarioDao buscarTudo() {
        usuarios.size();
        return null;
    }
}
