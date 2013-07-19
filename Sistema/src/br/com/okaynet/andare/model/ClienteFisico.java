/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;

/**
 *
 * @author Erick
 */
@Entity
public class ClienteFisico extends Fisico implements Serializable {

    public ClienteFisico() {
    }

    public ClienteFisico(String referencia1, String referencia2, String referencia3) {
        this.referencia1 = referencia1;
        this.referencia2 = referencia2;
        this.referencia3 = referencia3;
    }

    public ClienteFisico(String nome, String sobrenome, String rg, String cpf, Calendar nascimento, Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(nome, sobrenome, rg, cpf, nascimento, id, endereco, email, dataCadastro);
    }

    public ClienteFisico(String referencia1, String referencia2, String referencia3, String nome, String sobrenome, String rg, String cpf, Calendar nascimento, Integer id, Endereco endereco, String email, Calendar dataCadastro) {
        super(nome, sobrenome, rg, cpf, nascimento, id, endereco, email, dataCadastro);
        this.referencia1 = referencia1;
        this.referencia2 = referencia2;
        this.referencia3 = referencia3;
    }
    private String referencia1;
    private String referencia2;
    private String referencia3;

    public String getReferencia1() {
        return referencia1;
    }

    public void setReferencia1(String referencia1) {
        this.referencia1 = referencia1;
    }

    public String getReferencia2() {
        return referencia2;
    }

    public void setReferencia2(String referencia2) {
        this.referencia2 = referencia2;
    }

    public String getReferencia3() {
        return referencia3;
    }

    public void setReferencia3(String referencia3) {
        this.referencia3 = referencia3;
    }

    @Override
    public String toString() {
        return super.getNome();
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
}
