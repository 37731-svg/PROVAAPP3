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



# PROVAAPP3