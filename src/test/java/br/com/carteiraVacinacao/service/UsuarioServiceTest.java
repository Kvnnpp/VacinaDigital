package test.java.br.com.carteiraVacinacao.service;

import main.java.br.com.carteiradevacinacao.modelo.Usuario;
import main.java.br.com.carteiradevacinacao.service.UsuarioService;
import org.junit.Assert;
import org.junit.Test;

public class UsuarioServiceTest {

    @Test
    public void recuperaUsuarioPeloNomeTest()
                    throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNome("Wilson da Silva");
        usuario.setCpf("41798949806");
        usuario.setDataNacimento("06-05-1994");
        UsuarioService.adicionaUsuario(usuario);

        Assert.assertEquals(usuario,
                            UsuarioService.recuperaUsuarioPeloNome(usuario.getNome()));

    }


}