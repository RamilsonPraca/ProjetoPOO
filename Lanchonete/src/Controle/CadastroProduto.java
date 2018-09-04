/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Produto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class CadastroProduto implements CadastroProdutoInt{
    Set<Produto> listaProdutos;

    public CadastroProduto() {
        listaProdutos = new HashSet<>();
    }
    
    @Override
    public boolean salvar(Produto produto) {
        if (this.listaProdutos.contains(produto)) {
        return false;
        }
        this.listaProdutos.add(produto);
        return true;
    }

    @Override
    public boolean editar(Produto produto,String codigo) {
        if (this.listaProdutos.contains(produto)){
            for (Produto p : listaProdutos){
                if (p.getCodigo().equals(produto.getCodigo())){
                    p.setCodigo(produto.getCodigo());
                    p.setDescricao(produto.getDescricao());
                    p.setNome(produto.getNome());
                    p.setValorUnitario(produto.getValorUnitario());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean excluir(String codigo) {
        if(existe(codigo)){
            for(Produto p : listaProdutos){
                if(p.getCodigo().equals(codigo)){
                    listaProdutos.remove(p);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<Produto> listar(){
        return listaProdutos;
    }
    
    /*public Funcionario buscar(String cpf) {
     boolean naoFiltrarCpf = (cpf == null || cpf.trim().isEmpty());

     for (Funcionario f : listaFuncionario) {
          if (f.getCpf().contains(cpf.trim()) || naoFiltrarCpf) {
               return f;
          }
     }
     return null;
    }*/
    
    public boolean existe(String codigo){
        return this.listaProdutos.stream().anyMatch((f) -> (f.getCodigo().equals(codigo)));
    }
    
}
