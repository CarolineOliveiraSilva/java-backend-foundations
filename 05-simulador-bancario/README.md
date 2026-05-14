# 🏦 Simulador Bancário

Aplicação de console desenvolvida em Java para simular as operações básicas de uma conta bancária. O objetivo central deste projeto é a aplicação prática de conceitos fundamentais da Programação Orientada a Objetos (POO).

## 🎓 Contexto Educacional

Este projeto foi desenvolvido como exercício prático do curso de Java ministrado pelo professor **Nélio Alves**. O código faz parte da minha rotina de estudos e documenta meu avanço contínuo na consolidação de conhecimentos de desenvolvimento backend.

## ⚙️ Funcionalidades

O sistema interage com o usuário via terminal para realizar o fluxo completo de uma conta:
- Cadastro de nova conta bancária (Número e Titular).
- Opção de inicialização com ou sem depósito inicial.
- Realização de depósitos.
- Realização de saques (com aplicação de regra de negócio: taxa fixa de $ 5.00 por saque).
- Exibição de extrato atualizado após cada operação.

## 📚 Conceitos Técnicos Aplicados

Este projeto consolida os seguintes pilares da Orientação a Objetos:

- **Encapsulamento:** Proteção do estado interno da classe `Account`. Atributos como o saldo (`balance`) e o número da conta (`number`) são privados e não possuem métodos *Setters* públicos, garantindo que não sejam adulterados de fora da classe. O saldo só é alterado através de métodos controlados (`deposit` e `withdraw`).
- **Sobrecarga de Construtores (Overloading):** Implementação de múltiplos construtores na classe `Account`, permitindo a criação de objetos com diferentes assinaturas (com ou sem o valor de depósito inicial).
- **Palavra-chave `this`:** Utilizada para resolver ambiguidades entre parâmetros e atributos da classe.
- **Delegação de Responsabilidade:** O construtor que recebe o depósito inicial delega a adição do valor ao método `deposit()`, centralizando a regra de negócio e evitando repetição de código.
- **Formatação de Dados:** Utilização do `Locale.US` e `String.format` no método `toString()` para garantir a exibição correta de valores monetários.

## 🚀 Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Clone este repositório ou baixe os arquivos fonte.
3. Navegue até o diretório do projeto contendo a pasta `src`.
4. Compile os arquivos:
   ```bash
   javac application/Program.java entities/Account.java
