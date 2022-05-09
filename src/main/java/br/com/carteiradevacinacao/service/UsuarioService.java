package main.java.br.com.carteiradevacinacao.service;

import main.java.br.com.carteiradevacinacao.dao.UsuarioDao;
import main.java.br.com.carteiradevacinacao.modelo.Usuario;

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
    public static void adicionaUsuario(Usuario usuario) {
        usuarioDao.adicionar(usuario);
    }

    //metodo validaUsuario se existe ou não ao buscar na base
    public static Usuario recuperaUsuarioPeloNome(String nome)
		    throws Exception {
        if (usuarioDao.buscar(nome) != null){
	    return usuarioDao.buscar(nome);
        }

        throw new Exception("Usuário Inexistente");
    }



}
