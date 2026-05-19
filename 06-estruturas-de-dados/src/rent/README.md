# Sistema de Gerenciamento de Aluguéis (Boarding House)

## Descrição do Projeto
Aplicação em Java desenvolvida para gerenciar a alocação de quartos em uma pensão. O sistema controla a disponibilidade de 10 unidades (indexadas de 0 a 9) e registra os dados cadastrais dos locatários. A solução tem como objetivo principal a manipulação de estruturas de dados estáticas (arrays de objetos) para gerenciar o estado da aplicação em tempo de execução, emitindo um relatório final que lista exclusivamente as unidades com alocação ativa.

## Especificações Técnicas
* **Linguagem:** Java
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Estrutura de Dados:** Arrays unidimensionais de objetos
* **Controle de Fluxo:** Laços de repetição e estruturas condicionais aplicadas à varredura e validação de índices
* **Entrada e Saída:** Gerenciamento de fluxo de entrada via `java.util.Scanner`

## Instruções de Execução
1. Clone este repositório em sua máquina local.
2. Importe o diretório do projeto em sua IDE (como Eclipse ou ambiente compatível com a estrutura padrão Java).
3. Execute o arquivo principal `Program.java`, localizado no pacote `application`.
4. Siga as instruções apresentadas no console para a inserção de dados (quantidade de locatários, nomes, e-mails e números dos quartos escolhidos).

## Log de Execução (Exemplo)

```text
How many rooms will be rented? 3

Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1

Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8

Busy rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com