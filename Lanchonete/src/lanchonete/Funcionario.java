
package lanchonete;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Funcionario {
    
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String emailAcesso;
    private String senhaAcesso;
    private String telefone;
    private String setor;

    public Funcionario(String nome, String cpf, LocalDate nascimento, String emailAcesso, String senhaAcesso, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.cpf);
        hash = 41 * hash + Objects.hashCode(this.nascimento);
        hash = 41 * hash + Objects.hashCode(this.emailAcesso);
        hash = 41 * hash + Objects.hashCode(this.senhaAcesso);
        hash = 41 * hash + Objects.hashCode(this.telefone);
        hash = 41 * hash + Objects.hashCode(this.setor);
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
        if (!Objects.equals(this.cpf, other.cpf)) {
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
        if (!Objects.equals(this.setor, other.setor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", emailAcesso=" + emailAcesso + ", senhaAcesso=" + senhaAcesso + ", telefone=" + telefone + ", setor=" + setor +'}';
    }
    
    
    
    
}
