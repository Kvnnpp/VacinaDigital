package main.java.br.com.carteiradevacinacao.util;

import main.java.br.com.carteiradevacinacao.dao.UsuarioDao;
import main.java.br.com.carteiradevacinacao.modelo.Usuario;
import main.java.br.com.carteiradevacinacao.teste.Constants;
import main.java.br.com.carteiradevacinacao.service.UsuarioService;

import java.util.Scanner;

import static main.java.br.com.carteiradevacinacao.service.UsuarioService.validaResposta;

public class ScanUtil {

    public static void main (String[] args)
                    throws Exception {
        dadosUsuario();
    }

    private static void dadosUsuario()
                    throws Exception {
        Scanner leitor = new Scanner(System.in);

        //Objeto usuario
        Usuario usuario = new Usuario();

        //Tela de Login
        System.out.println(Constants.TELA_INICIAL);
        String menuPrincipal = leitor.nextLine();

        switch (menuPrincipal) {
            case "1":
                //// Busca usuário na Array do UsuarioDao
                System.out.println(Constants.INFORME_USUARIO);
                String nome = leitor.nextLine();
                System.out.println(Constants.PESQUISANDO);
                usuario = UsuarioService.recuperaUsuarioPeloNome(nome);
                System.out.println(usuario);
                System.out.println(Constants.TELA_USUARIO);

                String subMenu = leitor.nextLine();
                switch (subMenu) {
                    case "1":;

                    case "2":;

                    case "3":
                        System.out.println(usuario);;

                    case "4":;

                } break;
                
            case "2":
                //Adiciona um novo usuario na ARRAY

                System.out.println(Constants.DIGITE_NOME_COMPLETO);
                usuario.setNome(leitor.nextLine().replaceAll("[^a-zA-Z]", ""));
                validaResposta(usuario.getNome());

                System.out.println(Constants.DIGITE_CPF);
                usuario.setCpf(leitor.nextLine().replaceAll("[^0-9]", ""));
                // return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
                validaResposta(usuario.getCpf());

                System.out.println(Constants.DIGITE_DATA_DE_NACIMENTO);
                usuario.setDataNacimento(leitor.nextLine().replaceAll("[^0-9]", ""));
                validaResposta(usuario.getDataNacimento());

                System.out.println(usuario.getNome() + Constants.BOAS_VINDAS);
                UsuarioService.adicionaUsuario(usuario);
                System.out.println(usuario);
                System.out.println(Constants.ADD_LINHA);
                break;
                
            case "3":
                System.exit(0);
        }
        dadosUsuario();
    }

}