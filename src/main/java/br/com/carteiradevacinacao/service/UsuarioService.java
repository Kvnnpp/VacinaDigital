package br.com.carteiradevacinacao.service;

import br.com.carteiradevacinacao.dao.UsuarioDao;
import br.com.carteiradevacinacao.modelo.Usuario;

public class UsuarioService {

    private static UsuarioDao usuarioDao = new UsuarioDao();

    //metodo validaResposta
    public static void validaResposta(String resposta){
	// função
	if (resposta.trim().isEmpty()) {
	    // Substituir por excessoes
	    System.out.println("Por favor preencha corretamente seus dados!");
	} else {
	    //se estiver errado devo solicitar novamente o preenchimento.
	    System.out.println("proxima etapa");
	}
    }

    // Adiciona o Usuario na Array do Usuario DAO
    public static void adicionaUario(Usuario usuario) {
        usuarioDao.adicionar(usuario);
    }

    //metodo validaUsuario se existe ou não ao buscar na base
    public static void validaUsuario (String nome){
        if (usuarioDao.buscar(nome) != null){
	    System.out.println(usuarioDao.buscar(nome));
        }else{
	    System.out.println("Usuário Inexistente");
        }
    }



}
