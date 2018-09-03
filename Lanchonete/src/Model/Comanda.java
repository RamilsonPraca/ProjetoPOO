package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author Administrador
 */
public class Comanda {
    
    private List<Pedido> pedidos;
    private int numeroMesa;

    public Comanda(List<Pedido> pedidos, int numeroMesa) {
        this.pedidos = new ArrayList<>();
        this.numeroMesa = numeroMesa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.pedidos);
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
        final Comanda other = (Comanda) obj;
        if (!Objects.equals(this.pedidos, other.pedidos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comanda{" + "pedidos=" + pedidos + '}';
    }

  
    
         
}
