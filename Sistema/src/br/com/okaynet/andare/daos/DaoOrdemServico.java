/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.OrdemServico;

/**
 *
 * @author Erick
 */
public class DaoOrdemServico extends DaoGenerics<OrdemServico> {

    public DaoOrdemServico() {
        super.alvo = OrdemServico.class;
    }
}
