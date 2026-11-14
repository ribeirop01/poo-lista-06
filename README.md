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
| Interface | Comportamento | Quando usar (exemplo) |

| `List` | Mantém a ordem de inserção, acesso por índice, **permite duplicados** | Lista de compras, histórico de pedidos |
| `Set` | **Não permite duplicados**, normalmente sem acesso por índice | CPFs ou e-mails únicos, tags de um post |
| `Map` | Pares **chave → valor**, chaves únicas, busca rápida pela chave | Dicionário, cadastro buscado por matrícula, contagem de palavras |

## Questão 3
| | HashSet | LinkedHashSet | TreeSet |

| **Ordem** | Nenhuma garantida | Ordem de inserção | Ordem natural (ou por `Comparator`) |
| **Busca / inserção / remoção** | O(1) em média | O(1) em média | O(log n) |
| **Uso de memória** | Menor | Maior que o HashSet (lista ligada extra) | Maior (nós da árvore rubro-negra) |

- `HashSet`: usa tabela hash, é o mais rápido quando a ordem não importa.
- `LinkedHashSet`: tabela hash + lista duplamente ligada para lembrar a ordem de inserção.
- `TreeSet`: usa árvore rubro-negra, mantém os elementos sempre ordenados.
