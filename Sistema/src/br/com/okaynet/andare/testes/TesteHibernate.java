/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import br.com.okaynet.andare.conexao.HibernateConfiguration;

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
        HibernateConfiguration.criarSchema();
    }
}
