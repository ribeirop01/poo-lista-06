import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaUsuarios sistema = new SistemaUsuarios();
        int opcao;

        do {
            System.out.println("\n1 - Inserir  2 - Listar  3 - Remover  0 - Sair");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(sc.nextLine().trim());

            switch (opcao) {
                case 1 -> {
                    System.out.print("E-mail: ");
                    String email = sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();
                    if (sistema.inserir(new Usuario(email, nome, senha))) {
                        System.out.println("Usuario inserido.");
                    } else {
                        System.out.println("Ja existe um usuario com esse e-mail!");
                    }
                }
                case 2 -> sistema.listar();
                case 3 -> {
                    System.out.print("E-mail do usuario a remover: ");
                    String email = sc.nextLine();
                    System.out.println(sistema.remover(email) ? "Usuario removido." : "Usuario nao encontrado.");
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }
}
