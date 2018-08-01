
package lanchonete;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Funcionario {
    
    private String nome;
    private String rg;
    private LocalDate nascimento;
    private String emailAcesso;
    private String senhaAcesso;
    private String telefone;

    public Funcionario(String nome, String rg, LocalDate nascimento, String emailAcesso, String senhaAcesso, String telefone) {
        this.nome = nome;
        this.rg = rg;
        this.nascimento = nascimento;
        this.emailAcesso = emailAcesso;
        this.senhaAcesso = senhaAcesso;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmailAcesso() {
        return emailAcesso;
    }

    public void setEmailAcesso(String emailAcesso) {
        this.emailAcesso = emailAcesso;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.rg);
        hash = 41 * hash + Objects.hashCode(this.nascimento);
        hash = 41 * hash + Objects.hashCode(this.emailAcesso);
        hash = 41 * hash + Objects.hashCode(this.senhaAcesso);
        hash = 41 * hash + Objects.hashCode(this.telefone);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.emailAcesso, other.emailAcesso)) {
            return false;
        }
        if (!Objects.equals(this.senhaAcesso, other.senhaAcesso)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", rg=" + rg + ", nascimento=" + nascimento + ", emailAcesso=" + emailAcesso + ", senhaAcesso=" + senhaAcesso + ", telefone=" + telefone + '}';
    }
    
    
    
    
}
