package lanchonete;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Cardapio {
    
    private List<Produto> produtos  ;

    public Cardapio() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.produtos);
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
        final Cardapio other = (Cardapio) obj;
        if (!Objects.equals(this.produtos, other.produtos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cardapio{" + "produtos=" + produtos + '}';
    }

  

    
    
    
}
