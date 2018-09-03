
package Controle;

import Model.Funcionario;

/**
 *
 * @author Administrador
 */
public interface CadastroUsuarioInt {
    public boolean autentica(String emailAcesso, String senhaAcesso);
    public boolean salvar(Funcionario funcionario);
    public boolean editar(Funcionario funcionario, String cpf);
    public boolean excluir(String cpf);
    
}
