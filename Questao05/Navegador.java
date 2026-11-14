import java.util.ArrayDeque;
import java.util.Deque;

public class Navegador {
    // Deque usado como pilha (LIFO): push/pop/peek atuam no topo
    private final Deque<String> historico = new ArrayDeque<>();

    public void visitar(String titulo) {
        historico.push(titulo);
        System.out.println("Abrindo: " + titulo);
    }

    public void voltar() {
        if (historico.size() <= 1) {
            System.out.println("Nao ha pagina anterior.");
            return;
        }
        historico.pop(); // remove a pagina atual
        System.out.println("Voltando para: " + historico.peek());
    }

    public void paginaAtual() {
        System.out.println(historico.isEmpty() ? "Nenhuma pagina aberta." : "Pagina atual: " + historico.peek());
    }
}
