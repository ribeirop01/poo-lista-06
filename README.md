# poo-lista-06

## Questão 1

O **Java Collections Framework** é um conjunto de interfaces (`Collection`, `List`, `Set`, `Queue`, `Map`), implementações (`ArrayList`, `HashSet`, `HashMap`...) e algoritmos (`Collections.sort`, `binarySearch`...) para armazenar e manipular grupos de objetos.

**Benefícios em relação aos arrays:**

- **Tamanho dinâmico**: crescem e diminuem automaticamente, enquanto arrays têm tamanho fixo;
- **Estruturas prontas** para diferentes necessidades (listas, conjuntos, filas, pilhas, mapas);
- **API rica**: métodos como `add`, `remove`, `contains`, `sort` e integração com streams;
- **Generics**: segurança de tipos em tempo de compilação;
- **Reuso e padronização**: código mais curto, legível e já testado.

## Questão 2

- **`List`**: mantém a ordem de inserção, permite acesso por índice e **permite duplicados**. Exemplo de uso: lista de compras, histórico de pedidos.
- **`Set`**: **não permite duplicados** e, normalmente, não tem acesso por índice. Exemplo de uso: CPFs ou e-mails únicos, tags de um post.
- **`Map`**: guarda pares **chave → valor**, com chaves únicas e busca rápida pela chave. Exemplo de uso: dicionário, cadastro buscado por matrícula, contagem de palavras.

## Questão 3

**HashSet**
- Ordem: nenhuma garantida.
- Busca, inserção e remoção: O(1) em média.
- Memória: menor uso entre os três.

**LinkedHashSet**
- Ordem: ordem de inserção.
- Busca, inserção e remoção: O(1) em média.
- Memória: maior que o HashSet (lista ligada extra).

**TreeSet**
- Ordem: ordem natural (ou definida por um `Comparator`).
- Busca, inserção e remoção: O(log n).
- Memória: maior (nós da árvore rubro-negra).

Resumo:

- `HashSet`: usa tabela hash, é o mais rápido quando a ordem não importa.
- `LinkedHashSet`: tabela hash + lista duplamente ligada para lembrar a ordem de inserção.
- `TreeSet`: usa árvore rubro-negra, mantém os elementos sempre ordenados.
