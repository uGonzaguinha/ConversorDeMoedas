# Conversor de Moedas

Este é um projeto simples de Conversor de Moedas desenvolvido em Java. O objetivo deste projeto é permitir que os usuários realizem conversões de moedas em tempo real utilizando dados de uma API de taxas de câmbio.

## Funcionalidades

- Escolha da moeda de origem e destino para conversão.
- Conversão dinâmica com taxas de câmbio obtidas em tempo real de uma API.
- Interface de usuário via console para interação simples e direta.
- Suporte para as seguintes moedas:
    - ARS - Peso argentino
    - BOB - Boliviano boliviano
    - BRL - Real brasileiro
    - CLP - Peso chileno
    - COP - Peso colombiano
    - USD - Dólar americano

## Como Executar

1. Clone o repositório ou baixe os arquivos do projeto.
2. Importe o projeto em sua IDE.
3. Execute a classe `ConversorDeMoedas.java`.
4. Siga as instruções no console para selecionar as moedas de origem e destino, e para inserir o valor a ser convertido.
5. Digite `0` a qualquer momento para sair do programa.

## Exemplo de Uso

```sh
Conversor de Moedas
Escolha a moeda de origem:
1. ARS - Peso argentino
2. BOB - Boliviano boliviano
3. BRL - Real brasileiro
4. CLP - Peso chileno
5. COP - Peso colombiano
6. USD - Dólar americano
0. Sair
> 3
Escolha a moeda de destino:
1. ARS - Peso argentino
2. BOB - Boliviano boliviano
3. BRL - Real brasileiro
4. CLP - Peso chileno
5. COP - Peso colombiano
6. USD - Dólar americano
0. Sair
> 6
Digite o valor em BRL: 100
Valor em USD: 18.39
```

## API Utilizada
Este projeto utiliza a Exchange Rate API para obter as taxas de câmbio em tempo real.
