/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Funcionario;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Administrador
 */
public class CadastroUsuario implements CadastroUsuarioInt{
    private Set<Funcionario> listaFuncionario;

    public CadastroUsuario() {
        listaFuncionario = new HashSet<>();
    }
    
    
     
    @Override
    public boolean autentica(String email, String senha){
        return listaFuncionario.stream().anyMatch((f) -> (f.getEmailAcesso().equals(email) && f.getSenhaAcesso().equals(senha)));
    }

    @Override
    public boolean salvar(Funcionario funcionario) {
        if (this.listaFuncionario.contains(funcionario)) {
        return false;
        }
        this.listaFuncionario.add(funcionario);
        return true;
    }

    @Override
    public boolean editar(Funcionario funcionario,String cpf) {
        if (this.listaFuncionario.contains(funcionario)){
            for (Funcionario f : listaFuncionario){
                if (f.getCpf().equals(funcionario.getCpf())){
                    f.setNome(funcionario.getNome());
                    f.setCpf(funcionario.getCpf());
                    f.setEmailAcesso(funcionario.getEmailAcesso());
                    f.setSenhaAcesso(funcionario.getSenhaAcesso());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean excluir(String cpf) {
        if(existe(cpf)){
            for(Funcionario f : listaFuncionario){
                if(f.getCpf().equals(cpf)){
                    listaFuncionario.remove(f);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<Funcionario> listar(){
        return listaFuncionario;
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
    
    public boolean existe(String cpf){
        return this.listaFuncionario.stream().anyMatch((f) -> (f.getCpf().equals(cpf)));
    }
    
}
