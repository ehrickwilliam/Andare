/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.testes;

import br.com.okaynet.andare.bibliotecas.ReportManage;
import br.com.okaynet.andare.bibliotecas.Util;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author ehrickwilliam
 */
public class testeRelatorio {

    public static void main(String[] args) {


        ReportManage report = new ReportManage();
        try {
            report.relatorioPronto("clientes");
        } catch (JRException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
