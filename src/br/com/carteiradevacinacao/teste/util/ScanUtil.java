package br.com.carteiradevacinacao.teste.util;

import br.com.carteiradevacinacao.dao.UsuarioDao;
import br.com.carteiradevacinacao.modelo.Usuario;
import br.com.carteiradevacinacao.teste.Constants;
import java.util.Scanner;

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

        System.out.println("Olá "+ usuario.getNome() + "\n Bem vindo a sua Carteira de Vacinação!!!");

        System.out.println(usuario);
        System.out.println("--------------------");

        //// Adicionando o Usuario na Array do Usuario DAO
        UsuarioDao add = new UsuarioDao();
        add.adicionar(usuario);

        add.buscar(usuario.getId(1));
        System.out.println(usuario);

    }

    //metodo validaResposta
    public static void validaResposta (String resposta){
        // verificar diferença de .equals par a==

        // função
        if (resposta.trim().isEmpty()) {
            System.out.println("Por favor preencha corretamente seus dados!");
        } else {
            //se estiver errado devo solicitar novamente o preenchimento.
            System.out.println("proxima etapa")  ;
        }
    }

}