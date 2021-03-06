package test.java.br.com.carteiraVacinacao.teste;

import main.java.br.com.carteiradevacinacao.modelo.Usuario;
import main.java.br.com.carteiradevacinacao.service.UsuarioService;
import org.junit.Assert;
import org.junit.Test;


public class ScanUtilTest {

    @Test
    public void testeBuscaUsuario()
                    throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNome("Kevin Paes de Paula");
        usuario.setCpf("41798949806");
        usuario.setDataNacimento("06-05-1994");
        UsuarioService.adicionaUsuario(usuario);

        Assert.assertEquals("Kevin Paes de Paula",usuario.getNome());
        Assert.assertEquals("41798949806",usuario.getCpf());
    }
}