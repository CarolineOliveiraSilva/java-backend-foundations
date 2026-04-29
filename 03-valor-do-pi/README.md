# 🧮 Exercício: Cálculo de Circunferência e Volume (Membros Estáticos)

Este repositório contém um exercício prático para fixação de conceitos de **Membros Estáticos (`static`)** e **Constantes (`final`)** em Java, transferindo a responsabilidade das operações matemáticas para uma classe utilitária.

---

## 📄 O Problema

Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com duas casas decimais.

As fórmulas utilizadas para os cálculos matemáticos a partir do raio ($r$) são:

* **Circunferência:** $C = 2 \cdot \pi \cdot r$
* **Volume:** $V = \frac{4}{3} \cdot \pi \cdot r^3$

---

## 🧠 Anotações de Estudo

### 1. Membros Estáticos (`static`)
Membros declarados como `static` pertencem à própria **classe**, e não a uma instância (objeto) específica dela.
* **Aplicação:** Neste exercício, os métodos de cálculo (`circumference` e `volume`) são estáticos. Isso significa que podemos chamá-los diretamente usando o nome da classe (ex: `Calculator.circumference(radius)`), sem a necessidade de instanciar um objeto na memória usando a palavra `new`. É o comportamento ideal para classes que funcionam como "caixas de ferramentas".

### 2. Constantes (`final`)
A palavra-chave `final` é utilizada para declarar que o valor de uma variável não pode ser modificado após sua atribuição inicial.
* **Aplicação:** O valor de PI é universal e imutável. Logo, ele foi declarado como uma constante pública e estática na classe utilitária: `public static final double PI = 3.14159;`.

---

## 🚀 Benefícios da Abordagem Estática observados:

1.  **Delegação de Responsabilidades:** O programa principal (método `main`) fica enxuto e focado apenas na interação com o usuário (entrada e saída de dados), enquanto as regras matemáticas ficam isoladas e protegidas na classe `Calculator`.
2.  **Economia de Memória:** Como não precisamos criar um objeto `Calculator` na memória cada vez que formos fazer uma conta, o programa se torna mais eficiente.
