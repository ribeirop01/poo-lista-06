import java.util.LinkedHashSet;
import java.util.Set;

public class SistemaUsuarios {
    // Set nao permite duplicados; LinkedHashSet mantem a ordem de insercao
    private final Set<Usuario> usuarios = new LinkedHashSet<>();

    public boolean inserir(Usuario u) {
        return usuarios.add(u); // false se o e-mail ja existe
    }

    public void listar() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario cadastrado.");
            return;
        }
        usuarios.forEach(System.out::println);
    }

    public boolean remover(String email) {
        return usuarios.removeIf(u -> u.getEmail().equalsIgnoreCase(email));
    }
}
