import java.util.Objects;

public class Usuario {
    private final String email;
    private final String nome;
    private final String senha;

    public Usuario(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getEmail() { return email; }
    public String getNome() { return nome; }

    // Dois usuarios sao iguais se tiverem o mesmo e-mail
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario outro = (Usuario) o;
        return email.equalsIgnoreCase(outro.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email.toLowerCase());
    }

    @Override
    public String toString() {
        return nome + " <" + email + ">";
    }
}
