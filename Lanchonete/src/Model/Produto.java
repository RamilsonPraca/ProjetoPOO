package Model;

import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Produto {
    
    private String codigo;
    private String descricao;
    private String nome;
    private float valorUnitario;

    public Produto(String codigo, String descricao, String nome, float valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Produto outro = (Produto) obj;
        if (codigo == null) {
            if (outro.codigo != null) {
                return false;
            } else if (!codigo.equals(outro.codigo)) {
                return true;
            }
        }
        return true;
    }

   

    

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", nome=" + nome + ", valorUnitario=" + valorUnitario + '}';
    }
    
    
    
}
