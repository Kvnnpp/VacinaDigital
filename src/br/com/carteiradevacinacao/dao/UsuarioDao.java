package br.com.carteiradevacinacao.dao;

import br.com.carteiradevacinacao.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDao {

    private static List<Usuario> usuarios = new ArrayList<>();

    public void adicionar(Usuario usuario) {
        usuario.setId(usuarios.size() + 1);
        this.usuarios.add(usuario);
    }

    public void editar(Usuario usuario) {
        remover(usuario);
        adicionar(usuario);
    }

    public void remover(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public Usuario buscar(int usuario) {
        List<Usuario> usrAchado = usuarios
                        .stream()
                        .filter(c -> c.getId(usuario) == usuario)
                        .collect(Collectors.toList());
        if(!usrAchado.isEmpty()){
            return usrAchado.get(0);
        }
        return null;

    }

}
