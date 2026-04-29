# 💵 Exercício: Conversor de Câmbio com IOF (Membros Estáticos)

Este repositório contém um exercício prático focado na **Delegação de Responsabilidades** e no uso de **Membros Estáticos (`static`)**, isolando regras de negócio financeiras em uma classe utilitária independente.

---

## 📄 O Problema

Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe `CurrencyConverter` para ser responsável pelos cálculos.

**Exemplo de interação:**
> Qual o valor do dólar? 3.10
> Quantos dólares você vai comprar? 200.00
> Valor a ser pago em reais = 657.20

---

## 🧠 Anotações de Estudo

### 1. Classes Utilitárias (O conceito de "Ferramenta")
Neste cenário, a classe `CurrencyConverter` atua puramente como uma calculadora. Ela não precisa guardar informações (estado) do usuário para o futuro. 
* **A Solução:** Utilizamos o modificador `static` no método de conversão. Isso nos permite enviar os dados digitados (`quantidade` e `cotação`) direto para a classe processar, sem precisar instanciar um novo objeto na memória (`new CurrencyConverter()`).

### 2. Regras de Negócio e Constantes (`final`)
O IOF é uma taxa tributária fixa de 6% estipulada pelo problema.
* **A Solução:** Para evitar "números mágicos" soltos pelo código, o IOF foi declarado como uma constante estática: `public static final double IOF = 0.06;`. Se a lei mudar e a taxa for para 7%, o programador só precisa alterar essa única linha, e todo o sistema continuará funcionando perfeitamente.

### 3. A Lógica da Porcentagem
Para aplicar o acréscimo percentual do IOF corretamente, o cálculo não pode ser apenas uma soma simples da taxa. 
* A fórmula aplicada pelo método foi: `(quantidade * cotação) * (1 + IOF)`. Isso garante que os 6% incidam sobre o valor bruto total da transação.

---

## 🚀 Benefícios da Arquitetura observados:

1. **Separação de Preocupações (Separation of Concerns):** O arquivo principal (`Valor_dolar.java`) ficou responsável apenas pela interface (perguntar e exibir dados). Ele não faz ideia de como a matemática funciona.
2. **Manutenibilidade:** Se houver um erro de cálculo, sabemos exatamente onde procurar: na classe `CurrencyConverter`, sem precisar vasculhar o programa principal.
