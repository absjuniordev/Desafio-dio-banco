
# Banco Digital com Java e Orientação a Objetos

## Descrição
Este projeto é parte de um desafio de mentoria, focado em aplicar conceitos de Orientação a Objetos (OO) em Java. O objetivo é criar uma aplicação que simule o funcionamento de um banco digital, oferecendo funcionalidades básicas como abertura de contas, depósitos, saques e transferências entre contas.

## Cenário
O banco fictício oferece aos seus clientes dois tipos de contas:
- **Conta Corrente**
- **Conta Poupança**

Ambos os tipos de contas permitem realizar depósitos, saques e transferências entre contas da mesma instituição.

## Conceitos Aplicados

### Abstração
Abstração é a capacidade de se concentrar nos aspectos essenciais de um domínio, ignorando detalhes menos importantes ou acidentais. Neste projeto, as contas correntes e poupança são abstrações de entidades reais do domínio bancário.

### Encapsulamento
Encapsulamento é o processo de esconder a implementação dos objetos, expondo apenas o necessário por meio de interfaces públicas. Isso facilita a manutenção e evolução do sistema, pois as mudanças na implementação interna não afetam outras partes do código.

### Herança
Herança permite criar novas classes baseadas em classes existentes. Neste projeto, as classes de contas (corrente e poupança) herdam características e comportamentos de uma classe base comum, representando características compartilhadas entre diferentes tipos de contas.

### Polimorfismo
Polimorfismo é a capacidade de tratar objetos de classes derivadas como objetos de uma classe base comum. Neste projeto, isso permite que as contas correntes e poupança sejam manipuladas de maneira uniforme, apesar de suas diferenças.

## Estrutura do Projeto
- `Conta`: Classe base que define os atributos e métodos comuns a todos os tipos de contas.
- `ContaCorrente`: Classe derivada de `Conta`, específica para contas correntes.
- `ContaPoupanca`: Classe derivada de `Conta`, específica para contas poupança.
- `Banco`: Classe que gerencia as contas e operações bancárias.

## Funcionalidades
- **Depósito**: Permite adicionar fundos a uma conta.
- **Saque**: Permite retirar fundos de uma conta, desde que haja saldo disponível.
- **Transferência**: Permite transferir fundos entre contas da mesma instituição.

## Como Executar
1. Clone este repositório.
2. Importe o projeto em sua IDE de preferência.
3. Compile e execute o projeto.

## Conclusão
Este projeto demonstra a aplicação prática dos quatro pilares da orientação a objetos em um cenário realista, proporcionando uma base sólida para a criação de aplicações mais complexas.
