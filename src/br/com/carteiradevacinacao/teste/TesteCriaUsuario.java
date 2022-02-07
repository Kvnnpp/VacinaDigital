package br.com.carteiradevacinacao.teste;

import br.com.carteiradevacinacao.modelo.Usuario;

import java.util.ArrayList;

public class TesteCriaUsuario {

    public static void main(String[] args) {

        ArrayList usuarios = new ArrayList();

        Usuario usr = new Usuario();
        usr.setId(usuarios.size() + 1);
        usr.setNome("Kevin Paes de Paula");
        usr.setCpf("41798949806");
        usr.setDataNacimento("06-05-1994");
        usuarios.add(usr);

        Usuario usr2 = new Usuario();
        usr2.setId(usuarios.size() + 1);
        usr2.setNome("Joaquim da Silva Sauro");
        usr2.setCpf("123456789");
        usr2.setDataNacimento("06-05-1990");
        usuarios.add(usr2);

        Usuario usr3 = new Usuario();
        usr3.setNome("Glauber Cunha da BiciCreta");
        usr3.setCpf("123456789");
        usr3.setDataNacimento("06-05-1990");
        usuarios.add(usr3);

        System.out.println(usuarios.size());

        for (Object usrRef: usuarios) {
            System.out.println(usrRef);
        }
        usuarios.remove(0);

        System.out.println("------------------------------------");
        for (Object usrRef: usuarios) {
            System.out.println(usrRef);
        };




    }

}
