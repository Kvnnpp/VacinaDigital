package test.java.br.com.carteiraVacinacao.teste;

import br.com.carteiradevacinacao.modelo.Usuario;
import br.com.carteiradevacinacao.service.UsuarioService;
import org.junit.Assert;
import org.junit.Test;


public class ScanUtilTest {

    @Test
    public void main() {
        Usuario usuario = new Usuario();
        usuario.setNome("Kevin Paes de Paula");
        usuario.setCpf("41798949806");
        usuario.setDataNacimento("06-05-1994");
        UsuarioService.adicionaUario(usuario);
        UsuarioService.validaUsuario(usuario.getNome());

        Assert.assertEquals("Kevin Paes de Paula",usuario.getNome());
        Assert.assertEquals("41798949806",usuario.getCpf());
    }
}