
package administersystem;

import entities.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministerSystem {
    private static ArrayList<Usuario> users = new ArrayList<>();
    
    public static void main(String[] args) {
        /*Aplicação do método de cadastrar o usuário*/
        int opcao;

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("---Menu---");
            System.out.println("Digite a funcionalidade");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Lista usuários");
            System.out.println("3 - Sair");
            opcao = input.nextInt();
            input.nextLine();
            
            switch(opcao){
                case 1:
                    cadastrar(input);
                    break;
                case 2:
                    listaUsuario();
                    break;

                case 3:
                    System.out.println("Programa encerrado :)");
                    System.exit(0);              
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
        
    }
    
    public static void cadastrar(Scanner input){
        
        System.out.println("Digite seu nome de usuário: ");
        String nome = input.nextLine();
        
        System.out.println("Digite seu e-mail: ");
        String email = input.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = input.nextLine();
        
        System.out.println("Digite seu cargo: ");
        String cargo = input.nextLine();
        
        //Usuario usuario = new Usuario(nome, email, senha, cargo);
        //users.add(usuario);
        
        //System.out.println("Cadastro Realizado com sucesso!\nBem Vindo! "+usuario.getNomeUsuario()+"\n");
        
    }
    
    public static void listaUsuario(){
        
        if(users.isEmpty()){
            System.out.println("Nenhum usuário cadastrado\n");
        }
        else{
            for (Usuario u : users) {
                System.out.println("Lista Usuários: ");
                System.out.println("Usuário: "+u.getNomeUsuario()+"Cargo: "+ u.getCargo()+"\n");     
            }
        }
    }
    
}
