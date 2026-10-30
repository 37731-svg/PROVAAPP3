# Locadora de Veículos — Estrada Livre

**Integrantes**
- Fernando Yudi Hirata
- Maria Clara Nunes Lopes

## Organização
- `src/model`: classes e interface do domínio.
- `src/app`: classe com o método main para testar o sistema.

## Como compilar e executar

Abra o terminal na pasta LocadoraVeiculos e execute:

```bash
javac -d out src/model/*.java src/app/*.java
java -cp out app.TesteLocadora
```
Requer ter o javaJDK instalado.

## Saída do programa

```text
=== ALUGUÉIS ===
Placa: ABC-1234 | Modelo: Sedan
Aluguel (3 dias): R$ 495.0

Placa: DEF-5678 | Modelo:  SUV
Aluguel (4 dias): R$ 320.0

Placa: GHI-9012 | Modelo: Trator
Aluguel (5 dias): R$ 340.0

Placa: JKL-3456 | Modelo: Eletrico
Aluguel (3 dias): R$ 705.0

=== RECARGA ===
Recarga (3 dias): R$ 24.0
```


-------------------------------------------------------------------CONTEUDO DO CHATPGT--------------------------------------------------------------------------------------
1. O que já está dentro do ZIP
A estrutura está organizada assim:
Locadora_Estrada_Livre/
│
├── model/
│   ├── Veiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   ├── CarroEletrico.java
│   └── Eletrico.java
│
├── app/
│   └── TesteLocadora.java
│
├── README.md
└── PROMPTS.md


O projeto já contém:
- Classe abstrata Veiculo.
- Herança entre as classes.
- Sobrescrita dos métodos.
- Interface Eletrico.
- Encapsulamento com atributos privados.
- Polimorfismo em uma única lista.
- Teste de recarga apenas dos elétricos.
2. Como executar o projeto
Depois de baixar e extrair o ZIP:
1. Abra a pasta Locadora_Estrada_Livre no VS Code.
2. Abra o terminal.
3. Execute:
javac -d out model/*.java app/*.java


Depois:
java -cp out app.TesteLocadora


3. Resultado esperado
O programa já foi compilado e executado. Estes foram os resultados:
Conferência dos valores
Cenário	Resultado
Carro – 3 dias	R$ 495,00
Moto – 4 dias	R$ 320,00
Moto – 5 dias	R$ 340,00
Elétrico – 3 dias	R$ 705,00
Recarga elétrica	R$ 24,00

Todos os valores conferidos

4. Como preencher o questionário PROMPTS.md
Deixei o arquivo PROMPTS.md dentro do ZIP, com o primeiro registro preenchido.

Atenção: vocês precisam completar o registro com o que realmente fizeram durante a prova. Não inventem erros ou alterações.
Como conferir
Na seção Como conferimos, vocês podem escrever:

"O grupo executou o programa pelo terminal utilizando os comandos javac e java. Depois, comparamos os resultados com a tabela da prova e verificamos que todos os valores estavam corretos."
Sobre a seção de erros
Se aparecer algum erro durante a execução, registrem:
- Qual foi o erro.
- Como vocês perceberam.
- O que fizeram para corrigir.
Se não aparecer nenhum, expliquem como verificaram que o código estava correto.
5. Entendendo as três perguntas finais
O professor pede que essas respostas sejam feitas sem consultar a IA. Por isso, vou deixar uma explicação dos conceitos para vocês estudarem, mas não vou preencher as respostas no lugar do grupo.
Pergunta 1 — Classe abstrata

Estudem:
- O que significa uma classe ser abstrata?
- Por que não podemos criar um objeto diretamente de Veiculo?
- Por que existem carros e motos como tipos específicos?
  
  Pergunta 2 — Polimorfismo
Estudem:
- Como diferentes veículos podem ficar na mesma lista?
- O que acontece quando chamamos calcularAluguel()?
- Por que cada classe apresenta um resultado diferente?
  
  Pergunta 3 — Interface
Estudem:
- O que é uma interface?
- Por que somente o carro elétrico implementa Eletrico?
- Qual seria o problema de colocar calcularRecarga() em todos os veículos?

6. O que fazer antes de entregar
- [ ] Extrair o ZIP.
- [ ] Abrir o projeto no VS Code.
- [ ] Executar os comandos no terminal.
- [ ] Conferir os resultados.
- [ ] Colocar o terceiro integrante, se houver.
- [ ] Conferir o README.
- [ ] Completar o PROMPTS.md.
- [ ] Responder às três perguntas finais com as palavras do grupo.
Minha recomendação: não entreguem sem antes entender principalmente a diferença entre classe abstrata, interface e polimorfismo. São justamente os três conceitos centrais dessa prova.



# PROVAAPP3
