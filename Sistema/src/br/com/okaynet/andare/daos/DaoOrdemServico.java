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
    SimpleDateFormat formatadorTotal = new SimpleDateFormat("yyyy-MM-dd");
    String dataFormatadaNormal = formatadorTotal.format(data);

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

    public List<OrdemServico> obterVencidas() {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id");
        lista = query.list();
        return lista;
    }

    public Long count() {
        Query query = session.createQuery("select count(*) from "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id");
        return (Long) query.uniqueResult();
    }

    public List<OrdemServico> obterVencidasClientes(int id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND cliente.id = " + id + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterVencidasFuncionarios(int id) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND funcionario.id = " + id + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemServico> obterVencidasFuncionariosClientes(Integer id, Integer id0) {
        List<OrdemServico> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND funcionario.id = " + id + " AND cliente.id = " + id0 + " ORDER BY id");
        lista = query.list();
        return lista;
    }
}
