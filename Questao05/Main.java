import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Navegador nav = new Navegador();
        int opcao;

        do {
            System.out.println("\n1 - Visitar pagina  2 - Voltar  3 - Pagina atual  0 - Sair");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(sc.nextLine().trim());

            switch (opcao) {
                case 1 -> {
                    System.out.print("Titulo da pagina: ");
                    nav.visitar(sc.nextLine());
                }
                case 2 -> nav.voltar();
                case 3 -> nav.paginaAtual();
                case 0 -> System.out.println("Navegador fechado.");
                default -> System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }
}
