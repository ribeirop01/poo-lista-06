import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // a) Remover os elementos menores que 0
        List<Integer> numeros = List.of(5, -3, 8, -1, 0, 12, -7);
        List<Integer> semNegativos = numeros.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        System.out.println("a) Sem negativos: " + semNegativos);

        // b) Exibir as Strings que iniciam com a letra P
        List<String> palavras = List.of("Pedra", "Casa", "Papel", "Tesoura", "Pato", "Livro");
        System.out.println("b) Iniciam com P:");
        palavras.stream()
                .filter(s -> s.startsWith("P"))
                .forEach(System.out::println);

        // c) Palavras unicas de um paragrafo
        String paragrafo = "Java e uma linguagem. Java e orientada a objetos, e Java e muito usada.";
        Set<String> unicas = Arrays.stream(paragrafo.split("\\W+"))
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("c) Palavras unicas: " + unicas);
    }
}
