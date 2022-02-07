package br.com.carteiradevacinacao.util;

import br.com.carteiradevacinacao.dao.UsuarioDao;
import br.com.carteiradevacinacao.modelo.Usuario;
import br.com.carteiradevacinacao.service.UsuarioService;
import br.com.carteiradevacinacao.teste.Constants;
import java.util.Scanner;

import static br.com.carteiradevacinacao.service.UsuarioService.validaResposta;

public class ScanUtil
                extends UsuarioDao {

    public static void main (String[] args) {
        dadosUsuario();
    }

    private static void dadosUsuario() {
        Scanner leitor = new Scanner(System.in);

        //Objeto usuario
        Usuario usuario = new Usuario();

        System.out.println(Constants.DIGITE_NOME_COMPLETO);
        usuario.setNome(leitor.nextLine());
        validaResposta(usuario.getNome());

        System.out.println(Constants.DIGITE_CPF);
        usuario.setCpf(leitor.nextLine());
        validaResposta(usuario.getCpf());

        System.out.println(Constants.DIGITE_DATA_DE_NACIMENTO);
        usuario.setDataNacimento(leitor.nextLine());
        validaResposta(usuario.getDataNacimento());

        System.out.println(usuario.getNome() + Constants.BOAS_vINDAS);
        UsuarioService.adicionaUario(usuario);
        System.out.println(usuario);
        System.out.println(Constants.ADD_LINHA);

        //// Busca usuário na Array do UsuarioDao
        System.out.println(Constants.INFORME_USUARIO);

        String nome = leitor.nextLine();
        System.out.println(Constants.PESQUISANDO);
        UsuarioService.validaUsuario(nome);

    }

}