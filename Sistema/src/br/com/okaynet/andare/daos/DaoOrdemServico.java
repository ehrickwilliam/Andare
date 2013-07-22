/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.daos;

import br.com.okaynet.andare.model.OrdemServico;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Erick
 */
public class DaoOrdemServico extends DaoGenerics<OrdemServico> {

    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM");
    String dataFormatada = formatador.format(data);

    public DaoOrdemServico() {
        super.alvo = OrdemServico.class;
    }

    public List<OrdemServico> obter() {
        List<OrdemServico> lista = null;


        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' ORDER BY id DESC");
        lista = query.list();

        return lista;
    }
}
