package lanchonete;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Pedido {
    
    private Produto produto;
    private LocalDate data;
    private LocalDate hora;
    private float total;
    private boolean estado;

    public Pedido(Produto produto, LocalDate data, LocalDate hora, float total, boolean estado) {
        this.produto = produto;
        this.data = data;
        this.hora = hora;
        this.total = total;
        this.estado = estado;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.produto);
        hash = 79 * hash + Objects.hashCode(this.data);
        hash = 79 * hash + Objects.hashCode(this.hora);
        hash = 79 * hash + Float.floatToIntBits(this.total);
        hash = 79 * hash + (this.estado ? 1 : 0);
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
        final Pedido other = (Pedido) obj;
        if (Float.floatToIntBits(this.total) != Float.floatToIntBits(other.total)) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "produto=" + produto + ", data=" + data + ", hora=" + hora + ", total=" + total + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
