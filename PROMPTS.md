# PROMPTS — Grupo

**Integrantes:**
1. Fernando Yudi Hirata
2. Maria Clara Nunes Lopes

**Prova:** POO

**Usamos IA?** (X) Sim  ( ) Não

**Ferramenta e modelo:** ChatGPT

## Registro, na ordem

### Prompt 1

**O prompt (cópia exata):**

> responde o questionario e manda o arquivo .zip do vscode

**O que a IA devolveu:**

Foi criada uma estrutura Java com classe abstrata Veiculo, subclasses Carro, Moto e CarroEletrico, interface Recarregavel e uma classe de teste.
**O que fizemos com a resposta:** ( ) usamos como veio  (X) alteramos  ( ) descartamos

**Por quê:**

A estrutura foi montada para atender às regras descritas na prova. O grupo deve abrir, executar e conferir o código, corrigindo qualquer diferença encontrada no próprio computador.

## Como conferimos

A classe TesteLocadora percorre uma lista de Veiculo para imprimir resumo e aluguel. A recarga é testada separadamente por uma lista de Recarregavel. Execute os comandos do README e compare os resultados com a tabela da prova.

**Saída esperada:** carro R$ 495.0; moto em 4 dias R$ 320.0; moto em 5 dias R$ 340.0; carro elétrico R$ 705.0; recarga R$ 24.0.

## Onde a IA errou, ou onde nós erramos

Tivemos um erro no cálculo do carro elétrico, pois esquecemos de adicionar a taxa da bateria. Percebemos ao comparar com os valores da prova e corrigimos o código. Depois disso, o resultado ficou correto: R$ 705,00.

## Respostas finais, sem consultar a IA

**Respondam com as próprias palavras nos últimos cinco minutos da prova. Este espaço foi deixado em branco intencionalmente, conforme a regra do enunciado.**

**Pergunta 1:**

1. Não dá para criar um Veiculo diretamente pq ele é uma classe abstrata. A locadora precisa criar veículos específicos, como carro e moto, e não um veículo genérico.

**Pergunta 2:**

2. Isso funciona por causa da multiformidade, que permite calcular o aluguel de vários tipos de veículos no mesmo laço, sem ter que separar cada um.

**Pergunta 3:** 

3. Porque nem todos os veículos precisam de recarga. Se o método tivesse na classe Veiculo, todos teriam essa função, até os que não são elétricos. Por isso, a interface é melhor.
