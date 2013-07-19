/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Erick
 */
@Entity
public class OrdemServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataCadastro;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataVencimento;
    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa cliente;
    @ManyToOne(fetch = FetchType.EAGER)
    private Funcionario funcionario;
    private String descricao;
    private Double valor;
    private Boolean status;
    private Integer parcelas;
    private Integer parcelasRestantes;
    @OneToOne(fetch = FetchType.EAGER)
    private Endereco endereco;

    public OrdemServico() {
    }

    public OrdemServico(Integer id, Calendar dataCadastro, Calendar dataVencimento, Pessoa cliente, Funcionario funcionario, String descricao, Double valor, Boolean status, Integer parcelas, Integer parcelasRestantes, Endereco endereco) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.dataVencimento = dataVencimento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
        this.parcelas = parcelas;
        this.parcelasRestantes = parcelasRestantes;
        this.endereco = endereco;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getParcelasRestantes() {
        return parcelasRestantes;
    }

    public void setParcelasRestantes(Integer parcelasRestantes) {
        this.parcelasRestantes = parcelasRestantes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.dataCadastro);
        hash = 53 * hash + Objects.hashCode(this.dataVencimento);
        hash = 53 * hash + Objects.hashCode(this.cliente);
        hash = 53 * hash + Objects.hashCode(this.funcionario);
        hash = 53 * hash + Objects.hashCode(this.descricao);
        hash = 53 * hash + Objects.hashCode(this.valor);
        hash = 53 * hash + Objects.hashCode(this.status);
        hash = 53 * hash + Objects.hashCode(this.parcelas);
        hash = 53 * hash + Objects.hashCode(this.endereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrdemServico other = (OrdemServico) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastro, other.dataCadastro)) {
            return false;
        }
        if (!Objects.equals(this.dataVencimento, other.dataVencimento)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.parcelas, other.parcelas)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "id=" + id + ", dataCadastro=" + dataCadastro + ", dataVencimento=" + dataVencimento + ", cliente=" + cliente + ", funcionario=" + funcionario + ", descricao=" + descricao + ", valor=" + valor + ", status=" + status + ", parcelas=" + parcelas + ", endereco=" + endereco + '}';
    }
}
