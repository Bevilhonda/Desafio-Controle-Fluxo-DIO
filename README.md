# Contador de Intervalo

Este é um projeto simples em Java que permite contar os números entre dois valores fornecidos pelo usuário. O programa valida a entrada para garantir que o segundo número seja maior que o primeiro, lançando uma exceção personalizada se a validação falhar.

## Funcionalidades

- Solicita dois números do usuário.
- Verifica se o segundo número é maior que o primeiro.
- Imprime todos os números no intervalo entre os dois valores.
- Lança uma exceção personalizada `ParametrosInvalidosException` se a validação falhar.

## Exemplo de Uso

### Entrada

O programa pedirá para você inserir dois números:
Digite o primeiro número:
1
Digite o segundo número:
5

### Saída

O programa irá imprimir:

Imprimindo o número: 1
Imprimindo o número: 2
Imprimindo o número: 3
Imprimindo o número: 4
Imprimindo o número: 5

Se o segundo número for menor ou igual ao primeiro, o programa exibirá uma mensagem de erro:

Digite o primeiro número:
5
Digite o segundo número:
1
O segundo parâmetro deve ser maior que o primeiro.

