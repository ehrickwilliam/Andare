/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import br.com.okaynet.andare.conexao.Conexao;
import br.com.okaynet.andare.conexao.HibernateConfiguration;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public class TesteHibernate {

    public static void main(String[] args) {
        HibernateConfiguration.setBase("andare");
        HibernateConfiguration.setHost("127.0.0.1:3306");
        HibernateConfiguration.setPass("root");
        HibernateConfiguration.setUser("root");
        

        try {
            
            Connection conexao = Conexao.getConnection();
            conexao.createStatement().execute("create database if not EXISTS " + HibernateConfiguration.getBase());
            conexao.createStatement().execute("use " + HibernateConfiguration.getBase());
            HibernateConfiguration.criarSchema();
            conexao.createStatement().execute("INSERT INTO usuarios VALUES (1,'ehrick@vista.aero','ZXSACBDFEGIHOJML','63a9f0ea7bb98050796b649e85481845','Okaynet')");

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
