package View;

import Controle.CadastroUsuario;
import Model.Funcionario;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class App {

    public static void main(String[] args) {
        Funcionario admin = new Funcionario("Ramiz", "111.111.111-1", "ramiz@gmail.com", "1234");
        Funcionario admin2 = new Funcionario("Amilton", "222-222-222-22", "amilton@gmail.com", "1234");
        CadastroUsuario c1 = new CadastroUsuario();
        c1.salvar(admin2);
        c1.salvar(admin);

        Scanner entrada = new Scanner(System.in);
        //login. Iniciando Sistema.
        System.out.println("Digite o email:");
        String email = entrada.next();
        System.out.println("Digite a senha:");
        String senha = entrada.next();

        if (c1.autentica(email, senha)) {
            System.out.println("Seja bem vindo");
            int selecao;
            do {
                System.out.println("1 -> Gerenciamento de Funcionários");
                System.out.println("0 -> Sair do sistema ");
                selecao = entrada.nextInt();

                switch (selecao) {
                    case 1:
                        int opcao;
                        do {
                            System.out.println("Escolha uma opção:");
                            System.out.println("1 - Adicionar novo funcionario;");
                            System.out.println("2 - Editar algun funcionario;");
                            System.out.println("3 - excluir algun funcionario;");
                            System.out.println("4 - Listar todos os funcionarios.");
                            System.out.println("0 - Sair");
                            opcao = entrada.nextInt();

                            switch (opcao) {
                                case 1:
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
                                    break;
                                case 2:
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
                                    break;
                                case 3:
                                    System.out.println("digite o cpf");
                                    cpf = entrada.next();
                                    if (c1.existe(cpf)) {
                                        c1.excluir(cpf);
                                        System.out.println("Funcionario excluido");
                                    } else {
                                        System.out.println("funcionario não existe");
                                    }
                                    break;
                                case 4:
                                    System.out.println(c1.listar());
                                    break;
                                default:
                                    System.out.println("Saindo");
                                    break;
                            }
                        } while (opcao > 0 && opcao < 5);
                        break;
                        default:
                            System.out.println("Saindo do sistema...");
                            break;
                }
                }
                while (selecao > 0 && selecao < 3);
            } else {
            System.out.println("Usuario ou senha inválido!");
        }

        }
    }
