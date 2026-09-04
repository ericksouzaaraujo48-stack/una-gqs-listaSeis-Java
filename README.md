# Cálculo de Fatorial em Java

Programa simples em Java que calcula o fatorial de um número inteiro utilizando um loop `for`.

## 📋 Descrição

O fatorial de um número `n` (representado por `n!`) é o produto de todos os inteiros positivos menores ou iguais a `n`. Por exemplo:

```
5! = 5 × 4 × 3 × 2 × 1 = 120
```

Este programa implementa esse cálculo através do método `calcular`, que recebe um número inteiro e retorna o valor do seu fatorial.

## 🗂️ Estrutura do Código

- **Classe:** `CalculoFatorial`
- **Método `calcular(int numero)`**
  - Recebe um número inteiro como parâmetro.
  - Inicializa a variável `resultado` em `1`.
  - Percorre um loop de `1` até `numero`, multiplicando `resultado` a cada iteração.
  - Retorna o valor final do fatorial.
- **Método `main(String[] args)`**
  - Define o número escolhido (`numeroEscolhido = 5`).
  - Chama o método `calcular` para obter o resultado.
  - Exibe o resultado no console.

## ▶️ Como Executar

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado. Você pode verificar com:
   ```bash
   java -version
   javac -version
   ```

2. Salve o código em um arquivo chamado `CalculoFatorial.java`.

3. Compile o programa:
   ```bash
   javac CalculoFatorial.java
   ```

4. Execute o programa:
   ```bash
   java CalculoFatorial
   ```

## 💻 Saída Esperada

```
O fatorial de 5 é: 120
```

## ⚙️ Personalizando

Para calcular o fatorial de outro número, basta alterar o valor da variável `numeroEscolhido` no método `main`:

```java
int numeroEscolhido = 7; // Altere para o número desejado
```

## ⚠️ Observações

- O tipo `int` utilizado no método `calcular` tem um limite de valores (até aproximadamente 2.147.483.647). Para números maiores que **12**, o resultado pode sofrer *overflow* (estouro de valor) e retornar um número incorreto.
- Para calcular fatoriais de números maiores, recomenda-se utilizar o tipo `long` ou a classe `BigInteger` do Java.
- O fatorial de `0` é definido como `1` (`0! = 1`), o que já é tratado corretamente por este código, já que o loop simplesmente não executa nenhuma iteração.

## 📄 Licença

Este projeto é de uso livre para fins educacionais.
