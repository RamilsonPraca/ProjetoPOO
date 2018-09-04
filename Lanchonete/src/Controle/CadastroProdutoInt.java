/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Produto;

/**
 *
 * @author Administrador
 */
public interface CadastroProdutoInt {
    public boolean salvar(Produto produto);
    public boolean editar(Produto produto, String codigo);
    public boolean excluir(String codigo);
    public boolean existe(String codigo);
    
}
