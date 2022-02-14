package br.com.carteiradevacinacao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Fabrica de conexões, com essa classe podemos conectar a qualquer banco de dados. ex:mysql
public class ConnectionFactory {
    public Connection getConnection(){
	try{
	    return DriverManager.getConnection("");
	}
	catch (SQLException excecao){
	    throw new RuntimeException(excecao);

	}
    }
}
