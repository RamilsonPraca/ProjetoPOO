package View;

import Control.ProdutoDaoImp;
import Control.UsuarioDaoImp;
import Model.Funcionario;
import Model.Produto;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class App {

    public static void main(String[] args) {
        Funcionario exemplo = new Funcionario("Ramiz", "111.111.111-1", "ramiz@gmail.com", "1234", "11111-1111", "Gerencia");
        Funcionario exemplo2 = new Funcionario("Amilton", "222-222-222-22", "amilton@gmail.com", "1234", "22222-2222", "Gerencia");
        UsuarioDaoImp u1 = new UsuarioDaoImp();
        u1.salvar(exemplo);
        u1.salvar(exemplo2);
        
        ProdutoDaoImp p1 = new ProdutoDaoImp();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o email:");
        String email = entrada.next();
        System.out.println("Digite a senha:");
        String senha = entrada.next();

        if (u1.autentica(email, senha)) {
            System.out.println("Seja bem vindo");
            int selecao;
            do {
                System.out.println("1 -> Gerenciamento de Funcionários");
                System.out.println("2 -> Gerencimento de Produtos");
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
                                    System.out.println("Telefone: ");
                                    String telefone = entrada.next();
                                    System.out.println("setor: ");
                                    String setor = entrada.next();
                                    Funcionario funcionario = new Funcionario(nome, cpf, emailAcesso, senhaAcesso, telefone, setor); 
         
                                    if (u1.salvar(funcionario) == true) {
                                    System.out.println("funcionario Adicionado com sucesso");
                                    }else{
                                    System.out.println("funcionario já existe no sistema");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Insira o cpf do funcionario que deseja atualizar: ");
                                    String cpfAntigo = entrada.next();
                                    entrada.nextLine();
                                    if (u1.existe(cpfAntigo) == true){
                                    System.out.println("Digite os dados");
                                    System.out.println("Nome: ");
                                    String nome2 = entrada.nextLine();
                                    System.out.println("Cpf: ");
                                    String cpf2 = entrada.next();
                                    System.out.println("E-mail:");
                                    String emailAcesso2 = entrada.next();
                                    System.out.println("Senha: ");
                                    String senhaAcesso2 = entrada.next();
                                    System.out.println("Telefone: ");
                                    String telefone2 = entrada.next();
                                    System.out.println("setor: ");
                                    String setor2 = entrada.next();
                                    Funcionario f2 = new Funcionario(nome2, cpf2, emailAcesso2, senhaAcesso2, telefone2, setor2);
                                    u1.editar(f2, cpfAntigo);
                                    System.out.println("Editado com sucesso");
                                    } else {
                                        System.out.println("Funcionário inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("digite o cpf");
                                    cpf = entrada.next();
                                    if (u1.existe(cpf)) {
                                        u1.excluir(cpf);
                                        System.out.println("Funcionario excluido");
                                    } else {
                                        System.out.println("funcionario não existe");
                                    }
                                    break;
                                case 4:
                                    System.out.println(u1.listar());
                                    break;
                                default:
                                    System.out.println("Saindo...");
                                    break;
                            }
                        } while (opcao > 0 && opcao < 5);
                        break;
                        
                        case 2:
                        int opcao2;
                        do {
                            System.out.println("Escolha uma opção:");
                            System.out.println("1 - Adicionar novo produto;");
                            System.out.println("2 - Atualizar produto;");
                            System.out.println("3 - Remover produto;");
                            System.out.println("4 - Listar todos os produtos.");
                            System.out.println("0 - Sair");
                            opcao2 = entrada.nextInt();

                            switch (opcao2) {
                                case 1:
                                    System.out.println("Adicione um novo produto");
                                    System.out.println("Código: ");
                                    String codigo = entrada.next();
                                    entrada.nextLine();
                                    System.out.println("Descrição: ");
                                    String descricao = entrada.nextLine();
                                    System.out.println("Nome:");
                                    String nome = entrada.nextLine();
                                    System.out.println("Preço unitário: ");
                                    Float valorUnitario = entrada.nextFloat();
                                    
                                    Produto produto = new Produto(codigo, descricao, nome, valorUnitario); 
         
                                    if (p1.salvar(produto) == true) {
                                    System.out.println("produto Adicionado com sucesso");
                                    }else{
                                    System.out.println("produto já existe no sistema");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Insira o código do produto que deseja atualizar: ");
                                    String codigoAntigo = entrada.next();

                                    if (p1.existe(codigoAntigo)) {
                                        System.out.println("Insira os dados para atualizar ");
                                        System.out.println("Código: ");
                                        String codigo2 = entrada.next();
                                        entrada.nextLine();
                                        System.out.println("descricao: ");
                                        String descricao2 = entrada.nextLine();
                                        System.out.println("Nome:");
                                        String nome2 = entrada.nextLine();
                                        System.out.println("Preço unitário: ");
                                        float valorUnitario2 = entrada.nextFloat();
                                        
                                        Produto produto2 = new Produto(codigo2, descricao2, nome2, valorUnitario2);
                                        p1.editar(produto2, codigoAntigo);
                                        System.out.println("Editado com sucesso");
                                        } else {
                                            System.out.println("Produto inexistente");
                                        }
                                    break;
                                case 3:
                                    System.out.println("digite o Codigo");
                                    codigo = entrada.next();
                                    if (p1.existe(codigo)) {
                                        p1.excluir(codigo);
                                        System.out.println("produto excluido");
                                    } else {
                                        System.out.println("produto não existe");
                                    }
                                    break;
                                case 4:
                                    System.out.println(p1.listar());
                                    break;
                                default:
                                    System.out.println("Saindo...");
                                    break;
                            } 
                        }while (opcao2 > 0 && opcao2 < 5);
                        
                        default:
                            System.out.println("Saindo...");
                            break;
                }
                }
                while (selecao > 0 && selecao < 3);
            } else {
            System.out.println("Usuario ou senha inválido!");
        }

        }
    }
