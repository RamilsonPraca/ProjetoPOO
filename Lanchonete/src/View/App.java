package View;

import Controle.CadastroUsuario;
import Model.Funcionario;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadastroUsuario c1 = new CadastroUsuario();
        
        
        String resposta = "s";
        while("s".equals(resposta)){
        System.out.println("Preencha os dados");
         System.out.println("Nome: ");
         String nome = entrada.next();
         System.out.println("Cpf: ");
         String cpf = entrada.next();
         System.out.println("E-mail:");
         String emailAcesso = entrada.next();
         System.out.println("Senha: ");
         String senhaAcesso = entrada.next();
         Funcionario funcionario = new Funcionario(nome, cpf, emailAcesso, senhaAcesso); 
         
         if (c1.salvar(funcionario) == true) {
                System.out.println("funcionario Adicionado com sucesso");
            }else{
                System.out.println("funcionario já existe no sistema");
            }
         
         
         System.out.println(c1.listar());       
         
         
         String excluir;
         System.out.println("deseja excluia algun funcionario");
         excluir = entrada.next();
            if ("excuir".equals(excluir)) {
                System.out.println("digite o cpf");
                cpf = entrada.next();
                if (c1.existe(cpf) == true) {
                    c1.excluir(cpf);
                    System.out.println(c1.listar());
                } else {
                    System.out.println("funcionario não existe");
                }
            }
            
         String buscar;
         System.out.println("deseja buscar alguem");
         buscar = entrada.next();
            if ("buscar".equals(buscar)) {
                System.out.println("Digite o cpf");
                cpf = entrada.next();
                if(c1.existe(cpf) == true){
                    System.out.println(c1.buscar(cpf));
                }else{
                System.out.println("Funcionario não encontrado");
                }
            }
            
        String editar;
        System.out.println("Deseja editar algun funcionario");
        editar = entrada.next();
            if ("editar".equals(editar)) {
                
                System.out.println("Insira o cpf do funcionario que deseja atualizar: ");
                String cpfAntigo = entrada.next();
                //verificando se existe algum funcionario com esse cpf.
                if (c1.existe(cpfAntigo) == true){
                System.out.println("Digite os dados");
                System.out.println("Nome: ");
                String nome2 = entrada.next();
                System.out.println("Cpf: ");
                String cpf2 = entrada.next();
                System.out.println("E-mail:");
                String emailAcesso2 = entrada.next();
                System.out.println("Senha: ");
                String senhaAcesso2 = entrada.next();
                Funcionario f2 = new Funcionario(nome2, cpf2, emailAcesso2, senhaAcesso2);
                c1.editar(f2, cpfAntigo);
                System.out.println("Editado com sucesso");
                } else {
                    System.out.println("Funcionário inexistente");
                }
            }
        
        String listar;    
        System.out.println("deseja Listar");
        listar = entrada.next();
        if ("listar".equals(listar)) {
                System.out.println(c1.listar());
                System.out.println("pronto!");
            }
         
         System.out.println("deseja continuar");
         resposta = entrada.next();
            
        }
  
    }
    
}
