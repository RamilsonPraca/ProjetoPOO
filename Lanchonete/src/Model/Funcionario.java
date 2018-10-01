
package Model;

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

    public Funcionario(String nome, String cpf, String emailAcesso, String senhaAcesso, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.emailAcesso = emailAcesso;
        this.senhaAcesso = senhaAcesso;
        this.telefone = telefone;
        this.setor = setor;
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
        hash = 29 * hash + Objects.hashCode(this.cpf);
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
        Funcionario outro = (Funcionario) obj;
        if (cpf == null) {
            if (outro.cpf != null) {
                return false;
            } else if (!cpf.equals(outro.cpf)) {
                return true;
            }
        }
        
        return true;
    }

    

    @Override
    public String toString() {
        return "Funcionario(" + "nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", emailAcesso=" + emailAcesso + ", senhaAcesso=" + senhaAcesso + ", telefone=" + telefone + ", setor=" + setor +')' + "\n";
    }
    
    
    
    
}
