/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author Administrador
 */
public interface CadastroProdutoInt {
    public boolean salvar(Produto produto);
    public boolean editar(Produto produto, String cpf);
    public boolean excluir(int codigo);
    
}
