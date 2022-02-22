package main.java.br.com.carteiradevacinacao.util;

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

        //Tela de Login
        System.out.println(Constants.TELA_INICIAL);
        String menu = leitor.nextLine();

        switch (menu) {
            case "1":
                //// Busca usuário na Array do UsuarioDao
                System.out.println(Constants.INFORME_USUARIO);

                String nome = leitor.nextLine();
                System.out.println(Constants.PESQUISANDO);
                UsuarioService.validaUsuario(nome);
                break;
            case "2":
                //Adiciona um novo usuario na ARRAY

                System.out.println(Constants.DIGITE_NOME_COMPLETO);
                usuario.setNome(leitor.nextLine().replaceAll("[^a-zA-Z]", ""));
                validaResposta(usuario.getNome());

                System.out.println(Constants.DIGITE_CPF);
                usuario.setCpf(leitor.nextLine().replaceAll("[^0-9]", ""));
                validaResposta(usuario.getCpf());

                System.out.println(Constants.DIGITE_DATA_DE_NACIMENTO);
                usuario.setDataNacimento(leitor.nextLine().replaceAll("[^0-9]", ""));
                validaResposta(usuario.getDataNacimento());

                System.out.println(usuario.getNome() + Constants.BOAS_vINDAS);
                UsuarioService.adicionaUario(usuario);
                System.out.println(usuario);
                System.out.println(Constants.ADD_LINHA);
                break;
            case "3":
                System.exit(0);
        }
        dadosUsuario();
    }

}