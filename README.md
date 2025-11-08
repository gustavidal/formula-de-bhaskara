# Fórmula de Bhaskara com Java

Olá a todos!

Este programa foi desenvolvido após mais uma jornada de estudos no **SENAI Jandira**, aplicando os conhecimentos adquiridos no curso técnico em **Desenvolvimento de Sistemas**.

Assim como no projeto anterior, o Teorema de Pitágoras, este código também foi feito como um desafio pessoal, com o objetivo de colocar em prática a lógica de programação e reforçar conceitos da linguagem Java.

No repositório do **GitHub**, é possível acompanhar cada commit, ver minha linha de raciocínio, as correções feitas e a evolução do código ao longo do processo.

## Como o programa funciona

O programa resolve equações do segundo grau, também conhecidas como equações quadráticas, que seguem a forma:

> ax² + bx + c = 0

O usuário informa os valores de a, b e c, e o programa:

1. Formata a equação, exibindo-a de forma clara e correta.
2. Calcula o Δ (delta) com a fórmula:

> Δ = b² - 4ac

3. Aplica a fórmula de Bhaskara para encontrar os valores de x₁ e x₂:

> x₁ = (-b + √Δ) / (2a)

> x₂ = (-b - √Δ) / (2a)

4. Exibe os resultados, formatados com duas casas decimais.
5. Caso o delta seja negativo, o programa informa que x₁ e x₂ não pertencem aos números reais (ℝ).

## Conceitos utilizados

- Entrada de dados com `Scanner`
- Estruturas condicionais (`if` / `else if` / `else`)
- Cálculos matemáticos com `Math.sqrt()`
- Formatação de saída com `String.format()`